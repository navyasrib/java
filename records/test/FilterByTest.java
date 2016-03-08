import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterByTest {
    @Test
    public void testGetGuestsBySpecificCountry() throws Exception {
        FilterBy f = new FilterBy();
        ArrayList<Person> list = new ArrayList<>(3);
        list.add(new Person("navya","basava","female","18","bangalore","Karnataka","India"));
        list.add(new Person("navya","basava","female","18","bangalore","Karnataka","russia"));
        list.add(new Person("navya","basava","female","18","bangalore","Karnataka","India"));
        List<Person> result = f.getListByCountry(list,"India");
        assertEquals(2,result.size());
    }

    @Test
    public void testGetGuestsByAgeAbove20() throws Exception {
        FilterBy f = new FilterBy();
        ArrayList<Person> list = new ArrayList<>(3);
        list.add(new Person("navya","basava","female","20","bangalore","Karnataka","India"));
        list.add(new Person("navya","basava","female","18","bangalore","Karnataka","russia"));
        list.add(new Person("navya","basava","female","25","bangalore","Karnataka","India"));
        List<Person> result = f.getByAge(list);
        assertEquals(2,result.size());
    }
}
