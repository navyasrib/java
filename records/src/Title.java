import java.util.Objects;

public class Title {

    public Title() {}

    public String prefix(String gender) {
        if(Objects.equals(gender, "M"))
            return "Mr";
        return "Ms";
    }
}
