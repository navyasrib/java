import personDetails.Name;

public class NameRepresentatorP {

    public NameRepresentatorP() {
    }

    public String getName(Name name) {
        return name.getFirstName() + " " + name.getLastName();
    }
}
