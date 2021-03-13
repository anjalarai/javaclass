package assignment;
import java.util.Scanner;
public class Question27 {
    private static void sumEachNumber(int number) {
        int sum = 0;
        int temp;
        while (number % 10 != 0) {
            temp = number % 10;
            sum = sum + temp;
            number = number / 10;
        }
        System.out.println("Sum is: " + sum);
    }

    private static void productEachNumber(int number) {
        int product = 1;
        int temp;
        while (number % 10 != 0) {
            temp = number % 10;
            product = product * temp;
            number = number / 10;
        }
        System.out.println("Product is: " + product);
    }

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num = input.nextInt();

        sumEachNumber(num);
        productEachNumber(num);
    }
}