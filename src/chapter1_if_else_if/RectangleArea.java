package chapter1_if_else_if;// 1.	Take values of length and breadth of a rectangle from user and check if it is square or not.

import java.util.Scanner;
import java.lang.Math;

public class RectangleArea {
    public static void main(String[] args){    // main method (static main method because we've used static keyword)

        Scanner sc = new Scanner(System.in);

        // 1. Data representation
        int length;
        int breadth;
        int area;

        // 2. Input
        System.out.print("Enter the length of a rectangle in meter: ");
        length = sc.nextInt();

        System.out.print("Enter the breadth of the rectangle in meter: ");
        breadth = sc.nextInt();

        // 3. Algorithm
        area = length * breadth;

        System.out.println("Area of the rectangle is " + area + " sq.m");

        // System.out.println(Math.sqrt(area));

        int squareRoot = (int) Math.sqrt(area);

        // 4. Output
        if ((squareRoot * squareRoot) == area){
            System.out.print(area + " is the perfect square.");
        }
        else {
            System.out.print(area + " is not the perfect square.");
        }
    }
}
