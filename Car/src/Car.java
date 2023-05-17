public class Car {
    String make;
    String model;
    int yearMade;

    public Car(String brand, String type, int year){
        make = brand;
        model = type;
        yearMade = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford", "F150",2016); //Car 1 Ford F150 2016
        Car car2 = new Car("Toyota","Camry",2012); //Car 2 Toyota Camry 2012
        Car car3 = new Car("Ford","Focus",2013); //Car 3 Ford Focus 2013
        Car car4 = new Car("Chevrolet","Suburban",2019); //Car 4 Chevrolet Suburban 2019

        //Print example
        System.out.print(car1.make + " ");
        System.out.print(car1.model + " (");
        System.out.println(car1.yearMade + ")");


    }
}