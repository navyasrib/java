import java.util.ArrayList;

public class SortByAddress {
    public SortByAddress() {
    }

    public ArrayList<Person> getListBy(ArrayList<Person> list, String country) {
        country = country.toUpperCase();
        ArrayList<Person> filteredList = new ArrayList<>();
        for (Person p : list) {
            String personCountry = p.getAddress().getCountry().toUpperCase();
            if (personCountry.equals(country))
                filteredList.add(p);
        }
        return filteredList;
    }
}
