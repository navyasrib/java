import java.util.ArrayList;
import java.util.List;

public class Invitees {

    private List<Person> allGuests;

    public Invitees() {
        allGuests = new ArrayList<>();
    }

    public void createPerson(String data) {
        String[] list = data.split("\n");
        for (String aList : list) {
            String[] details = aList.split(",");
            Person p = new Person(details[0], details[1], details[2], details[3], details[4], details[5], details[6]);
            allGuests.add(p);
        }
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
        FilterBy s = new FilterBy();
        return s.getListByCountry( allGuests,countryName);
    }

    public String getGuestsFirstLastCountry(String country) {
        String allNames = "";
        List<Person> sortedByCountry = getByCountry(country);
        for (Person guest : sortedByCountry) {
            allNames +=  guest.getFormalNameWithCountry();
            allNames += "\n";
        }
        return allNames;
    }

    public String getGuestsByLastFirstCountry(String country) {
        String allNames = "";
        List<Person> sortedByCountry = getByCountry(country);
        for (Person guest : sortedByCountry) {
            allNames +=  guest.getCasualNameWithCountry();
            allNames += "\n";
        }
        return allNames;
    }

}

