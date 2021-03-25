package CphBusiness;

public class Main {

    public static void main(String[] args) {
        Car car1 = new PetrolCar("AL47267","Ford","Ka",2013,2,95,20.4);
        Car car2 = new PetrolCar("BT20383","VW","Golf",2017,5,95,20.4);
        Car car3 = new PetrolCar("BZ85722","Audi","RS7",2017,5,95,10.5);
        Car car4 = new DieselCar("BT23018","Mercedes","GLB",2020,5,true,17.9);
        Car car5 = new DieselCar("AT29938","Audi","S6",2021,5,true,16.9);
        Car car6 = new ElectircCar("YT29382","Porche","Taycan",2020,4,93,452,26);

        System.out.println(car1.calculateEnvironmentalTax());
        System.out.println(car3.calculateEnvironmentalTax());
        System.out.println(car5.calculateEnvironmentalTax());
        System.out.println(car6.calculateEnvironmentalTax());

        Garage myGarage = new Garage("NiceCars");
        myGarage.addCars(car1);
        myGarage.addCars(car2);
        myGarage.addCars(car3);
        myGarage.addCars(car4);
        myGarage.addCars(car5);
        myGarage.addCars(car6);

        System.out.println(myGarage);

        System.out.println(myGarage.calculateTaxForGarage());

    }
}
