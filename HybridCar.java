package CarDealership;

// Vehicle Car
//     |
//    Car
//     |
//   HybridCar
public class HybridCar extends Car {
    private int batteryLife, MPG;
    private String chargerType;

    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, int batteryLife, int MPG, String chargerTyoe, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.chargerType = chargerType;
        this.MPG = MPG;
    }

    // Getters
    public int getBatteryLife() {
        return this.batteryLife;
    }

    public int getMPG() {
        return this.MPG;
    }

    public String getChargerType() {
        return this.chargerType;
    }

    // Setters
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setMPG(int MPG) {
        this.MPG = MPG;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

}
