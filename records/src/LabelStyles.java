import java.util.HashMap;

public class LabelStyles {
    private final Invitees root;
    private final HashMap<String, String> allLabels;

    public LabelStyles(Invitees root) {
        this.root = root;
        this.allLabels = new HashMap<>();
    }

    public void mapLables() {
        allLabels.put("lastFirst", "Names of all guests in last name first format:\n" + root.getLastFirstNames());
        allLabels.put("firstLast", "Names of all guests in first name first format:\n" + root.getFitstLastNames());
    }

    public void mapLables(String countryName) {
        allLabels.put("firstCountry", "Guests from "+countryName+" are:\n"+root.getGuestsFirstLastCountry(countryName));
        allLabels.put("lastCountry", "Guests from "+countryName+" are:\n"+root.getGuestsByLastFirstCountry(countryName));
    }

    public HashMap<String, String> getLables() {
        return allLabels;
    }

}
