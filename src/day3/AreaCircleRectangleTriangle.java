package day3;
import java.util.Scanner;

public class AreaCircleRectangleTriangle {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Radius:");
        double radius = sc.nextDouble();
         double area = 3.14*radius*radius;
        System.out.println("Area of circle:"+ area);

        System.out.println("length of rectangle:");
        double length = sc.nextDouble();
        System.out.println("width of rectangle:");
        double width = sc.nextDouble();
        double Rectangle = length *  width;
        System.out.println("Area of Rectangle:"+ Rectangle);

        System.out.println("height of triangle:");
        double height = sc.nextDouble();
        System.out.println("basewidth of rectangle:");
        double basewidth = sc.nextDouble();
        double Triangle= height *  basewidth;
        System.out.println("Area of Triangle:"+ Triangle);
    }

}
