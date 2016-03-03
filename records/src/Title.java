import java.util.Objects;

public class Title {

    public Title() {}

    public String prefix(String gender) {
        gender = gender.toUpperCase();
        if(Objects.equals(gender, "MALE"))
            return "Mr";
        return "Ms";
    }
}
