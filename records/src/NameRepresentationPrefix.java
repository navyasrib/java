public class NameRepresentationPrefix {

    public NameRepresentationPrefix() {
    }

    public String getName(Person p) {
        return p.getTitle() + " " + p.getFirstName() + " " + p.getLastName();
    }

    public String getNameWithCountry(Person p) {
        return getName(p) + ", " + p.getAddress().getCountry();
    }
}
