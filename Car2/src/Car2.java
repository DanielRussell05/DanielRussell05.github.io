import java.io.*;
import java.util.*;
public class Car2 implements Comparable<Car2> {
    String make;
    String model;
    int yearMade;

    public Car2() {

    }

    public Car2(String brand, String type, int year) {
        make = brand;
        model = type;
        yearMade = year;
        this.make = make;
        this.yearMade = yearMade;
    }

    public String toString() {
        return "(" + make + " " + model + " (" + yearMade + ")";
    }

    @Override
    public int compareTo(Car2 a) {
        if (this.make.compareTo(a.make) != 0) {
            return this.make.compareTo(a.make);
        } else {
            return this.yearMade - a.yearMade;
        }
    }

    public static void main(String[] args) {

        int n = 4;
        Car2 carList[] = new Car2[n];

        carList[0] = new Car2("Ford", "F150",2018);
        carList[1] = new Car2("Toyota","Camry", 2012);
        carList[2] = new Car2("Ford", "Focus", 2013);
        carList[3] = new Car2("Chevrolet", "Suburban", 2019);

        Arrays.sort(carList);

        //prints cars in alphabetical order
        print(carList);
    }

    public static void print(Car2[] carList) {
        for (int i = 0; i < carList.length; i++) {
            System.out.println(carList[i]);
        }
    }
}