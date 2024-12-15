public class Car extends Vehicle {
    private String brand;

    /** The car extends the vehicle and tells the details about the car's description */

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    /** This getter gets the brand name and tells about it to the user */

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void honk() {
        System.out.println("Honk");
    }

    /** This outputs the user information about the car and details about its description */

    public void displayInfo() {
        System.out.println("Number of Wheels: " + getNumberOfWheels());
        System.out.println("Color: " + getColor());
        System.out.println("Engine Size: " + getEngineSize());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Brand: " + getBrand());
    }
}
