package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        int a = number%10;
        int b = number/10;
        int c = b%10;
        int d = number/100;
        int sum = a+c+d;

        System.out.println("Sum of digits: " + sum);



    }
}
