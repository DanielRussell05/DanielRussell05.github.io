class Sold extends Car {
    int yearSold; //states the year the car was sold
    String color; //state the color of the car
    public Sold(int date, String hue) {
        yearSold = date;
        color = hue;
    }
    public void stateInfo() {
        System.out.println("This car's info is not to be known as someone else owns it.");
    }
}