package chapter1;// Write a program to find maximum between two numbers.
import java.util.Scanner;
public class GreatestNumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num;
        int second_num;
        System.out.print("Enter the first number: ");
        first_num = sc.nextInt();
        System.out.print("Enter the second number: ");
        second_num = sc.nextInt();

        if (first_num > second_num) {
            System.out.println(first_num + " is greater than " + second_num);
        }
        else {
            System.out.println(second_num + " is greater than " + first_num);
        }
    }
}
