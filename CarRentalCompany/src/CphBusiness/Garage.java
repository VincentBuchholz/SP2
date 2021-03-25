package CphBusiness;
import java.util.ArrayList;

public class Garage {
    private String name;
    ArrayList<Car> cars = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }
    public void addCars(Car car){
        cars.add(car);
    }

    @Override
    public String toString() {
        String cars ="";
        for (int i = 0; i < this.cars.size(); i++) {
            cars += this.cars.get(i).getMake() + " " + this.cars.get(i).getModel() + "\n";
        }
        return "Garage " + name + " contains: " + "\n" + cars;

    }

    public double calculateTaxForGarage(){
        double tax = 0;
        for (int i = 0; i < cars.size(); i++) {
            tax += cars.get(i).calculateEnvironmentalTax();
        }
        return tax;
    }
}
