package CphBusiness;

public class PetrolCar extends Car {
    private int octaneNumber;
    private double kmPrL;

    public PetrolCar(String regNr, String make, String model, int year, int amountOfDoors,int octaneNumber, double kmPrL) {
        super(regNr, make, model, year, amountOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    @Override
    public double calculateEnvironmentalTax() {
        double tax = 0;
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
        return super.toString() + ", octaneNumber=" + octaneNumber +
                ", kmPrL=" + kmPrL;
    }
}
