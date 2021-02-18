package day3;
import java.util.Scanner;


public class Perimeter {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Radius:");
        double radius = sc.nextDouble();
        double area = 3.14*2*radius;
        System.out.println("Perimeter of circle:"+ area);

        System.out.println("length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("width of rectangle:");
        double width = sc.nextDouble();
        double Rectangle = 2*(length *  width);
        System.out.println("Perimeter of Rectangle:"+ Rectangle);

        System.out.println("first side of triangle:");
        double s1 = sc.nextDouble();
        System.out.println("Second side of triangle:");
        double s2 = sc.nextDouble();
        System.out.println("Third side of triangle:");
        double s3 = sc.nextDouble();
        double Triangle= s1+s2+s3;
        System.out.println("Perimeter of Triangle:"+ Triangle);
    }}

