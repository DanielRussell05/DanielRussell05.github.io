public class Horse {

    //Simple horse class created by Kim Gross
//for CTE Software Development class 2022

    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames = 0; //how many old names are there.

    public Horse(String horseName, int year) { //horse constructor needs its name and birth year.
        name = horseName; //assigns the name of the horse to the horseName which was sent in the constructor.
        birthYear = year; //assigns the year to the birthYear that was sent in the constructor;
    }

    public void age() {
        // what should be in an age function?
    }

    public void changeName(String newName) {//change the name but safe the old name
        names[numberofNames] = name;
        numberofNames++;
        name = newName;
    }
    public String toString() {
        return name;
    }
    public static void main(String[] args){
        Horse horse1 = new Horse("Midnight",2000);
        Horse horse2 = new Horse("Silver", 2003);
        Horse horse3 = new Horse("Shadow", 1998);
        System.out.print(horse1 + " ");
        System.out.println(horse1.birthYear);
        System.out.print(horse2 + " ");
        System.out.println(horse2.birthYear);
        System.out.print(horse3 + " ");
        System.out.println(horse3.birthYear);
    }
}