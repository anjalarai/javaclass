package day3;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius:");
        double radius = sc.nextDouble();
        System.out.println("Length:");
        double length= sc.nextDouble();
        double area =3.14*radius*radius;
        double volume= area*length;
        System.out.println("Volume of cylinder" + volume);
    }
}
