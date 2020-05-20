package CarDealership;

public class Car extends Vehicle {
    // car constructor inheriting vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() { // have to use get methods in car class because the variables in vehicle are
                                      // private
        // return this.getRetailPrice()-this.getWholesaleCost()-1000; Below, you don't
        // have to redefine getTargetMargin
        return super.getTargetMargin() - 1000; // use the getTargetMargin method as its definined in our superclass,
                                               // Vehicle

    }
}