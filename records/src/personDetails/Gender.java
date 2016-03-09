package personDetails;

import java.util.Objects;

public class Gender {
    private final String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    public String title() {
        String g = gender.toUpperCase();
        return (Objects.equals(g, "MALE"))? Title.MALE.getTitle() : Title.FEMALE.getTitle();
    }

    public String toString(){
        return this.gender;
    }
}
