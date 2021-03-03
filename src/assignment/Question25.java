package assignment;
import java.util.Scanner;

public class Question25 {
    public static void main(String[] args)
    {
        String name = null;
        int count;
        double score = 0;
        double highest = 0;

        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number of student : ");
        int numberofstudent = input.nextInt();

        for (count=0; count<numberofstudent; count++)
        {
            System.out.print("\nStudent name : ");
            name = input.next().toUpperCase();
            System.out.print("Score        : ");
            score = input.nextInt();

            if (highest<score)
                highest=score;
        }
        System.out.print("\nThe highest score : " + highest );
    }
}