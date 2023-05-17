class NotSold extends Car {
    Boolean recency; //determines if the car was new or used at the time of purchase
    String color; //states the color of the car
    int money; //shows the price of the car
    public NotSold(boolean used, String hue, int cost) {
        recency = used;
        color = hue;
        money = cost;
    }
    public void stateInfo(){
        System.out.println("This car, which costs $" + money + ", is a " + make + " " + model + " manufactured in " +yearMade +". Color: " + color + ". Used: " + recency);

    }
}