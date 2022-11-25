
/*
 * Importing all classes within entities package.
 */
 
import entities.*;

/*
 * importing the Car class specifically in entities package
 */
// import entities.Car;

class Main {
    public static void main(String[] args) {
        Car car = new Car("IS250", "Lexus", 2008);
        System.out.println(car.getManufacturer() + " " + car.getModel() + " " + car.getYear());

        Ute ute = new Ute("L200", "Mitsubishi", 2016);
        System.out.println(ute.getManufacturer() + " " + ute.getModel() + " " + ute.getYear());

    }
}