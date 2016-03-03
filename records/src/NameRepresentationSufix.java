public class NameRepresentationSufix {
    public NameRepresentationSufix() {
    }

    public String getName(Person p) {
        return p.getTitle() + " " + p.getLastName() + ", " + p.getFirstName();
    }

    public String getNameWithCountry(Person person) {
        return getName(person)+", "+person.getAddress().getCountry();
    }
}
