package chapter1_if_else_if;// Write a program to find maximum between three numbers.
import java.util.Scanner;
public class GreatestNumThree {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int first_num;
        int second_num;
        int third_num;

        System.out.print("Enter the first number : ");
        first_num = obj.nextInt();
        System.out.print("Enter the second number: ");
        second_num = obj.nextInt();
        System.out.print("Enter the third number: ");
        third_num = obj.nextInt();

        if (first_num > second_num && first_num > third_num){
            System.out.print(first_num + " is the greatest among them.");
        }
        else if (second_num > first_num && second_num > third_num){
            System.out.print(second_num + " is the greatest among them.");
        }
        else {
            System.out.print(third_num + " is the greatest among them.");
        }
    }
}
