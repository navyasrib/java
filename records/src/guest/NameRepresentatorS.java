package guest;

import personDetails.Name;

public class NameRepresentatorS {
    public NameRepresentatorS() {
    }

    public String getName(Name name) {
        return name.getLastName() + ", " + name.getFirstName();
    }
}
