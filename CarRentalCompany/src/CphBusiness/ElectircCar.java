package CphBusiness;

public class ElectircCar extends Car {
    private int batteryCapacity;
    private int maxKm;
    private double whPrKm;

    public ElectircCar(String regNr, String make, String model, int year, int amountOfDoors, int batteryCapacity, int maxKm, int whPrKm) {
        super(regNr, make, model, year, amountOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    @Override
    public double calculateEnvironmentalTax() {
        double tax = 0;
        double kmPrL = 100/(whPrKm/91.25);

        if(kmPrL <= 20 && kmPrL >= 50){
            tax = 330;
        } else if (kmPrL < 20 && kmPrL >=15){
            tax =1050;
        } else if(kmPrL < 15 && kmPrL >=10){
            tax =2340;
        } else if (kmPrL < 10 && kmPrL>= 5){
            tax = 5500;
        } else {
            tax = 10470;
        }
        return tax;
    }

    @Override
    public String toString() {
        return super.toString() + "batteryCapacity=" + batteryCapacity +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm;
    }
}
