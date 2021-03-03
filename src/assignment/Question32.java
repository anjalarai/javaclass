package assignment;

import java.util.Scanner;

public class Question32 {
        public static void main(String args[]){
         int n, sum =0;

            Scanner in = new Scanner(System.in);
            System.out.println("Number of arrays");
            n = in.nextInt();
            int array[]  = new int [n];
            System.out.println("Enter elements");

            //Advanced for loop
            for( int i=0; i<n; i++) {
                array[i]=in.nextInt();
                sum = sum+ array[i];
            }
            System.out.println("Sum of array elements is:"+sum);
        }
    }

