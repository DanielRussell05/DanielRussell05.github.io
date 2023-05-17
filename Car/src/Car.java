public class Car {
    String make;
    String model;
    int yearMade;

    public Car(String brand, String type, int year) {
        make = brand;
        model = type;
        yearMade = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford", "F150", 2016); //Car 1 Ford F150 2016
        Car car2 = new Car("Toyota", "Camry", 2012); //Car 2 Toyota Camry 2012
        Car car3 = new Car("Ford", "Focus", 2013); //Car 3 Ford Focus 2013
        Car car4 = new Car("Chevrolet", "Suburban", 2019); //Car 4 Chevrolet Suburban 2019

        // if the car is a Ford, the date will be increased by 2 years
        // if the car is a Toyota, the date will be decreased by 2 years

        //fix car 1
        if (car1.make == "Ford") {
            car1.yearMade += 2;
        }
        if (car1.make == "Toyota") {
            car1.yearMade -= 4;
        }

        //fix car 2
        if (car2.make == "Ford") {
            car2.yearMade += 2;
        }
        if (car2.make == "Toyota") {
            car2.yearMade -= 4;
        }

        //fix car 3
        if (car3.make == "Ford") {
            car3.yearMade += 2;
        }
        if (car3.make == "Toyota") {
            car3.yearMade -= 4;
        }

        //fix car 4
        if (car4.make == "Ford") {
            car4.yearMade += 2;
        }
        if (car4.make == "Toyota") {
            car4.yearMade -= 4;
        }

        //explanation
        System.out.println("Unfortunately, when all the cars were inputted into the system, someone made a mistake when stating the years.");
        System.out.println("All Fords were said to be 2 years older than their real year.");
        System.out.println("In addition, all Toyotas were said to be 4 years newer than their real year.");
        System.out.println("These should be the correct years of each make and model.");

        //cars
        System.out.print(car1.make + " ");
        System.out.print(car1.model + " (");
        System.out.println(car1.yearMade + ")");

        System.out.print(car2.make + " ");
        System.out.print(car2.model + " (");
        System.out.println(car2.yearMade + ")");

        System.out.print(car3.make + " ");
        System.out.print(car3.model + " (");
        System.out.println(car3.yearMade + ")");

        System.out.print(car4.make + " ");
        System.out.print(car4.model + " (");
        System.out.println(car4.yearMade + ")");
    }
}