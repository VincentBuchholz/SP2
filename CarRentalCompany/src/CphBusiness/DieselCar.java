package CphBusiness;

public class DieselCar extends Car{
    private boolean hasParticleFilter;
    private double kmPrL;
    public DieselCar(String regNr, String make, String model, int year, int amountOfDoors, boolean hasParticleFilter, double kmPrL) {
        super(regNr, make, model, year, amountOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public double getKmPrL() {
        return kmPrL;
    }
    @Override
    public double calculateEnvironmentalTax() {
        double tax = 0;
        if(kmPrL <= 20 && kmPrL >= 50){
            tax = 330+130;
        } else if (kmPrL < 20 && kmPrL >=15){
            tax =1050+1390;
        } else if(kmPrL < 15 && kmPrL >=10){
            tax =2340+1850;
        } else if (kmPrL < 10 && kmPrL>= 5){
            tax = 5500+2770;
        } else {
            tax = 10470+15260;
        }
        if(hasParticleFilter) {
            return tax;
        } else {
            return tax+1000;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", hasParticleFilter=" + hasParticleFilter +
                ", kmPrL=" + kmPrL;
    }
}
