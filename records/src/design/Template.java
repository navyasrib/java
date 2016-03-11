package design;

import guest.Person;

public class Template {
    private final Person person;
    private final BorderRepresentation border;

    public Template(Person person) {
        this.person = person;
        this.border = new BorderRepresentation("+","-","|");
    }

    public String generate(String model) {

        return null;
    }
}
