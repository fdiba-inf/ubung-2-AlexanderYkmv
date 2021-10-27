package exercise2;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
   int r = input.nextInt();
   double Circumference = 2.0*r*(4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/11.0-1.0/13.0+1.0/17.0-1.0/19.0+1.0/23.0));
   double Area = 4.0*(1.0-1.0/3.0+1.0/5.0-1.0/7.0+1.0/11.0-1.0/13.0+1.0/17.0-1.0/19.0+1.0/23.0)*r*r;

    System.out.println("Circumference: " +Circumference);
    System.out.println("Area: " +Area);

    }
}
