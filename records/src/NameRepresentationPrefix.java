public class NameRepresentationPrefix {
    public NameRepresentationPrefix() {
    }

    public String getName(Person p) {
        return p.getTitle()+" "+p.getFirstName()+" "+p.getLastName();
    }
}
