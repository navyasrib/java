import java.util.ArrayList;
import java.util.List;

public class FilterBy {
    public FilterBy() {
    }

    public List<Person> getListByCountry(List<Person> list, String country) {
        country = country.toUpperCase();
        List<Person> filteredList = new ArrayList<>();
        for (Person p : list) {
            String personCountry = p.getAddress().getCountry().toUpperCase();
            if (personCountry.equals(country))
                filteredList.add(p);
        }
        return filteredList;
    }

    public List<Person> getByAge(List<Person> list){
        List<Person> filteredList = new ArrayList<>();
        for(Person p : list){
            if(Integer.parseInt(p.getAge()) >= 20)
                filteredList.add(p);
        }
        return filteredList;
    }
}
