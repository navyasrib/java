public class NameRepresentatorS {
    public NameRepresentatorS() {
    }

    public String getName(Person p) {
        return p.getTitle() + " " + p.getLastName() + ", " + p.getFirstName();
    }
}
