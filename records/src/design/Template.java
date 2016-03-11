package design;

import guest.Person;

import java.util.HashMap;

public class Template {
    private final Person person;
    private final BorderRepresentation border;
    private String allDetails;

    public Template(Person person) {
        this.person = person;
        this.border = new BorderRepresentation("+","-","|");
    }

    public String generate(String model) {
        model = model.toLowerCase();
        model = model.replace("title",person.getTitle());
        model = model.replace("firstname",person.getFirstName());
        model = model.replace("lastname",person.getLastName());
        model = model.replace("city", person.getAddress().getCity().toString());
        model = model.replace("state", person.getAddress().getState().toString());
        model = model.replace("country", person.getAddress().getCountry().toString());
        model = model.replace("age",person.getAge().toString());
        return model;
    }

    public String getWithBorder(String model) {
        String[] template = generate(model).split("\n");
        HashMap<String,String> lines = new HashMap<>();
        lines.put("first",template[0]);
        lines.put("second",template[1]);
        lines.put("third",template[2]);
        return border.generate(lines);
    }
}
