package proj1;
 import java.util.Scanner;
public class sum {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = x.nextInt();
        System.out.println("Enter b: ");
        int b = x.nextInt();
        int sum = a+b;
        int average = sum/2;

        System.out.println("Sum of "+a+" and " +b+ " is "+sum+ " Average of "+a+" and "+b+" is "+average+".");
    }

}
