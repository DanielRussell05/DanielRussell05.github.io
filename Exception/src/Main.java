public class Main {
    public static void main(String[] args) {
        String[] ar = new String[10];
        try {
            System.out.println(ar[12]);
        } catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);

        }
        System.out.println("The element you tried to call for is outside the length of the array.");

        try {
        int x = 4;
        int y = 3;
        int z = 0;
        int a = x + y;
        int b = a / z;
        
            System.out.println(b);
        } catch(ArithmeticException e) {
            System.out.println(e);

        }
        System.out.println("You tried to divide by 0. Try changing your values.");
    }
}