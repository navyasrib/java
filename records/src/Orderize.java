import java.util.ArrayList;
import java.util.List;

public class Orderize {

    public Orderize() {
    }

    public List arrange(String data) {
        String[] list = data.split("\n");
        List<Person> totalList = new ArrayList<>();
        System.out.println("list = " + list[0]);
        for (String aList : list) {
            String[] details = list[0].split(",");
            Person p = new Person(details[0],details[1],details[2],details[3],details[4],details[5],details[6]);
            totalList.add(p);
        }
        return totalList;
    }

//    public Person[] getFitstLastNames() {
//        return {};
//    }
}

