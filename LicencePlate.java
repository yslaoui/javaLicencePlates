package licencePlates;

import java.util.Objects;

public class LicencePlate {
    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicencePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LicencePlate that = (LicencePlate) o;
        return Objects.equals(liNumber, that.liNumber) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liNumber, country);
    }
}
