package personDetails;

public class Age {
    private final int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public boolean isGreaterThan(int a) {
        return this.age>=a;
    }
}
