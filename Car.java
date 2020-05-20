package CarDealership;

public class Car extends Vehicle {
    // car constructor inheriting vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
    }
}