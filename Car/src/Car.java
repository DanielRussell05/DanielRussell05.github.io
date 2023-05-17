//Object Project made by Daniel Russell
//States certain attributes of different cars and corrects any incorrect attributes
public class Car {
    String make;
    String model;
    int yearMade;

    public Car() {

    }
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
        Sold sold1 = new Sold (2002,"red");
        Sold sold2 = new Sold (2019, "blue");
        Sold sold3 = new Sold (2021, "white");
        NotSold notSold1 = new NotSold(true, "black",6000);
        NotSold notSold2 = new NotSold(false, "black",22500);
        NotSold notSold3 = new NotSold(false, "gray",31000);
        sold1.make = "Ford";
        sold1.model = "F350";
        sold1.yearMade = 1998;
        sold2.make = "Toyota";
        sold2.model = "Rav 4";
        sold2.yearMade = 2017;
        sold3.make = "Chevrolet";
        sold3.model = "Silverado";
        sold3.yearMade = 2020;
        notSold1.make = "Chevrolet";
        notSold1.model = "Cruise";
        notSold1.yearMade = 2005;
        notSold2.make = "Toyota";
        notSold2.model = "Camry";
        notSold2.yearMade = 2018;
        notSold3.make = "Toyota";
        notSold3.model = "Tacoma";
        notSold3.yearMade = 2015;

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

        if (sold1.make == "Ford") {
            sold1.yearMade += 2;
        }
        if (sold1.make == "Toyota") {
            sold1.yearMade -= 4;
        }

        if (sold2.make == "Ford") {
            sold2.yearMade += 2;
        }
        if (sold2.make == "Toyota") {
            sold2.yearMade -= 4;
        }

        if (sold3.make == "Ford") {
            sold3.yearMade += 2;
        }
        if (sold3.make == "Toyota") {
            sold3.yearMade -= 4;
        }

        if (notSold1.make == "Ford") {
            notSold1.yearMade += 2;
        }
        if (notSold1.make == "Toyota") {
            notSold1.yearMade -= 4;
        }

        if (notSold2.make == "Ford") {
            notSold2.yearMade += 2;
        }
        if (notSold2.make == "Toyota") {
            notSold2.yearMade -= 4;
        }

        if (notSold3.make == "Ford") {
            notSold3.yearMade += 2;
        }
        if (notSold3.make == "Toyota") {
            notSold3.yearMade -= 4;
        }

        //cars
        car1.stateInfo();
        car2.stateInfo();
        car3.stateInfo();
        car4.stateInfo();
        sold1.stateInfo();
        sold2.stateInfo();
        sold3.stateInfo();
        notSold1.stateInfo();
        notSold2.stateInfo();
        notSold3.stateInfo();
    }
    public void stateInfo() {
        System.out.println("This car is a " + make + " " + model + " manufactured in " + yearMade + ". It's color, cost, and whether it has been used before are unknown.");
    }
}