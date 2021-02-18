package day3;

import java.util.Scanner;

public class SimpleInterest {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("principal:");
        double p = sc.nextDouble();
        System.out.println("Time:");
        double T = sc.nextDouble();
        System.out.println("Rate:");
        double R= sc.nextDouble();
        double S = p*T*R/100;
        System.out.println("Simple Interest: " +S);
    }

}
