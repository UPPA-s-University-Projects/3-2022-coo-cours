import transportation.Car;
import transportation.IVehicle;

public class HelloCar {
    public static void main(String[] args) {
        IVehicle car = new Car("Opel");

        System.out.println(car);
    }
}