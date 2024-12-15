public class Main {
    public static void main(String[] args) {

        /** Prints the details about the car and information about it */

        Vehicle vehicle = new Vehicle(4, "Blue", 2.0f, "Petrol");
        System.out.println("Vehicle Details:");
        System.out.println("Number of Wheels: " + vehicle.getNumberOfWheels());
        System.out.println("Color: " + vehicle.getColor());
        System.out.println("Engine Size: " + vehicle.getEngineSize());
        System.out.println("Fuel Type: " + vehicle.getFuelType());

        /** Instantaition of the car object */

        Car car = new Car(4, "Red", 3.5f, "Diesel", "Toyota");
        System.out.println("\nCar Details:");
        car.displayInfo();
        car.honk();
    }
}
