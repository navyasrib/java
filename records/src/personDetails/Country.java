package personDetails;

import java.util.Objects;

public class Country {
    private final String country;

    public Country(String country) {
        this.country = country;
    }

    public boolean isSameAs(String c) {
        return Objects.equals(this.country.toUpperCase(), c.toUpperCase());
    }

    public String toString() {
        return this.country;
    }

}
