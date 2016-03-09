package personDetails;

public enum Title {
    MALE("Mr"), FEMALE("Ms");
    private String title;
    Title(String gender) {
        this.title = gender;
    }

    public String getTitle() {
        return title;
    }
}
