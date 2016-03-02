public class NameRepresentationSufix {
    public NameRepresentationSufix() {
    }

    public String getName(Person p) {
        return p.getTitle() + " " + p.getLastName() + ", " + p.getFirstName();
    }
}
