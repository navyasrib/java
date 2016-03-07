import java.util.ArrayList;
import java.util.List;

public class Orderize {

    private List<Person> allGuests;

    public Orderize() {
    }

    public List createPerson(String data) {
        String[] list = data.split("\n");
        List<Person> totalList = new ArrayList<>();
        for (String aList : list) {
            String[] details = aList.split(",");
            Person p = new Person(details[0], details[1], details[2], details[3], details[4], details[5], details[6]);
            totalList.add(p);
        }
        this.allGuests = totalList;
        return totalList;
    }

    public String getFitstLastNames() {
        String allNames = "";
        for (Person guest : allGuests) {
            allNames += guest.getFirstLastName();
            allNames += "\n";
        }
        return allNames;
    }

    public String getLastFirstNames() {
        String allNames = "";
        for (Person guest : allGuests) {
            allNames += guest.getLastFirstName();
            allNames += "\n";
        }
        return allNames;
    }

    public List<Person> getByCountry(String countryName) {
        SortByAddress s = new SortByAddress();
        return s.getListBy((ArrayList<Person>) allGuests,countryName);
    }

    public String getGuestsByCountry(String country) {
        String allNames = "";
        List<Person> sortedByCountry = getByCountry(country);
        for (Person guest : sortedByCountry) {
            allNames +=  guest.getFormalNameWithCountry();
            allNames += "\n";
        }
        return allNames;
    }

}

