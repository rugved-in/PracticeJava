package data;

import java.util.Objects;

public class Tigor extends Car {

    private String make;
    private String variant;
    private String engineType;
    private int year;

    public Tigor() {

    }

    public Tigor(String make, String variant, String engineType, int year) {
        this.make = make;
        this.variant = variant;
        this.engineType = engineType;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void roam() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tigor tigor = (Tigor) o;
        return Objects.equals(make, tigor.make)
                && Objects.equals(variant, tigor.variant)
                && Objects.equals(engineType, tigor.engineType)
                && Objects.equals(year, tigor.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), make, variant, engineType);
    }

    @Override
    public String toString() {
        return "Tigor{" +
                "make='" + make + '\'' +
                ", variant='" + variant + '\'' +
                ", engineType='" + engineType + '\'' +
                ", year=" + year +
                '}';
    }
}
