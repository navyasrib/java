package personDetails;

public class Name {
    private final String firstName;
    private final String lastName;

    public Name(String firstNmae, String lastName) {
        this.firstName = firstNmae;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString(){
        return this.firstName+", "+this.lastName;
    }
}
