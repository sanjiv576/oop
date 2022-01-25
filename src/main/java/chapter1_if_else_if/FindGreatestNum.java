package chapter1_if_else_if;// 2.	Take two int values from user and print greatest among them.

import java.lang.Math;
import java.util.Scanner;
public class FindGreatestNum {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        // 1. Data representation
        int first_num;
        int second_num;

        // 2. Input
        System.out.print("Enter the first number: ");
        first_num = obj.nextInt();

        System.out.print("Enter the second number: ");
        second_num = obj.nextInt();

        // 3. Algorithm and 4. Output
        System.out.println("\nGreatest number between " + first_num + " and " + second_num+ " is " + Math.max(first_num, second_num));
        System.out.println("Smallest number between " + first_num + " and " + second_num+ " is " + Math.min(first_num, second_num));

    }
}
