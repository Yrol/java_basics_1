package entities;

public class Car {

    private String model;

    private int year;

    private String manufacturer;

    public Car(String model, String manufacturer, int year) {
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