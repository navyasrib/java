public class Person {

    private final String firstName;
    private final String lastName;
    private final String gender;
    private final int age;
    private final Address address;
    private String title;

    public Person(String first, String last, String gen, int age, String city, String state, String country) {
        this.firstName = first;
        this.lastName = last;
        this.gender = gen;
        this.age = age;
        this.address = new Address(city,state,country);
    }

    private void assignTitle(){
        Title t = new Title();
        this.title = t.prefix(gender);
    }
    public String getTitle() {
        this.assignTitle();
        return this.title;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Address getAddress() {
        return address;
    }
}
