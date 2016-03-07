import java.util.ArrayList;
import java.util.Iterator;
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
        Iterator itr = allGuests.iterator();
        for (Person guest : allGuests) {
            allNames += guest.getFirstLastName();
            allNames += "\n";
        }
        return allNames;
    }

    public String getLastFirstNames() {
        String allNames = "";
        Iterator itr = allGuests.iterator();
        for (Person guest : allGuests) {
            allNames += guest.getLastFirstName();
            allNames += "\n";
        }
        return allNames;
    }
}

