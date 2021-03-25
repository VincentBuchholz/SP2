package CphBusiness;

public abstract class Car {
    private String regNr;
    private String make;
    private String model;
    private int year;
    private int amountOfDoors;

    public Car(String regNr, String make, String model, int year, int amountOfDoors) {
        this.regNr = regNr;
        this.make = make;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    public String getRegNr() {
        return regNr;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }
    public double calculateEnvironmentalTax(){
        double tax=0;
        return tax;
    }

    @Override
    public String toString() {
        return  "regNr='" + regNr + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", amountOfDoors=" + amountOfDoors;
    }
}
