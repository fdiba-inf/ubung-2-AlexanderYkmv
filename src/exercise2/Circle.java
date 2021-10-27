package exercise2;
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {

public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
   int r = input.nextInt();
   double Circumference = 2.0*r*Math.PI;
   double Area = Math.PI*r*r;

    System.out.println("Circumference: " +Circumference);
    System.out.println("Area: " +Area);

    }
}
