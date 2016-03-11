package design;

import guest.Person;

import java.util.HashMap;

public class Template {
    private final BorderRepresentation border;
    private final String template;
    private String allDetails;

    public Template(String template) {
        this.template = template;
        this.border = new BorderRepresentation("+","-","|");
    }

    public String generate(Person person) {
        String model = template;
        model = model.toLowerCase();
        model = model.replace("title", person.getTitle());
        model = model.replace("firstname", person.getFirstName());
        model = model.replace("lastname", person.getLastName());
        model = model.replace("city", person.getAddress().getCity().toString());
        model = model.replace("state", person.getAddress().getState().toString());
        model = model.replace("country", person.getAddress().getCountry().toString());
        model = model.replace("age", person.getAge().toString());
        return model;
    }

    public String getWithBorder(Person person) {
        String modeledData = generate(person);
        String[] model = modeledData.split("\n");
        HashMap<String,String> lines = new HashMap<>();
        lines.put("first",model[0]);
        lines.put("second",model[1]);
        lines.put("third",model[2]);
        return border.generate(lines);
    }
}
