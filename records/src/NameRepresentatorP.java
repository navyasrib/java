public class NameRepresentatorP {

    public NameRepresentatorP() {
    }

    public String getName(Person p) {
        return p.getTitle() + " " + p.getFirstName() + " " + p.getLastName();
    }
}
