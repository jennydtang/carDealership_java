package CarDealership;

public class Truck extends Vehicle {
    // car constructor inheriting vehicle
    public Truck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}