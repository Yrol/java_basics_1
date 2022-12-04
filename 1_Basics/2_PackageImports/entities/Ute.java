package entities;

public class Ute {

    private String model;

    private String manufacturer;

    private int year;

    public Ute(String model, String manufacturer, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public int getYear() {
        return this.year;
    }
}