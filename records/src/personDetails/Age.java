package personDetails;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public boolean isGreaterThan(int a) {
        return this.age>=a;
    }

    public String toString(){
        return String.valueOf(this.age);
    }
}
