package homework;

public class Question11b {
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;

        // Code to swap 'x' and 'y'
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("Swapping two numbers:" + " x = " + x + ", y = " + y);
    }

}
