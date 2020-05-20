package CarDealership;

public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean is4wd;

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, long towingCapacity, long truckWeight, boolean is4wd, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
    }

    // Getters public long
    public long getTowingCapacity() {
        return this.towingCapacity;
    }

    public long getTruckWeight() {
        return this.truckWeight;
    }

    public boolean getIs4wd() {
        return this.is4wd;
    }

    public long getGrossCombinedWeight() {
        return this.grossCombinedWeight;
    }

    // setters
    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long truckWeight) {
        this.truckWeight = truckWeight;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    public void setGrossCombinedWeight(long grossCombinedWeight) {
        this.grossCombinedWeight = grossCombinedWeight;
        // this.grossCombinedWeight=this.truckWeight+this.towingCapacity;
    }

    @Override // inheriting methods from something else; overloading is changing a method.
              // Loading loads extra paremters
    public String toString() {
        // Get output of toString method and store that in a variable for us to use
        String str = super.toString();
        // If 4WD, signify that it returns a string
        if (is4wd) {
            str += ", (4WD)"; // append string to end of string variable
        }
        return str;
    }

}