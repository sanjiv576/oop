package chapter6_class;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float first, second, third;

        System.out.print("Enter the first number : ");
        first = sc.nextFloat();

        System.out.print("Enter the second number : ");
        second = sc.nextFloat();

        System.out.print("Enter the third number : ");
        third = sc.nextFloat();

        Calculations calculate = new Calculations(first, second, third);
        System.out.println(calculate);


    }
}
