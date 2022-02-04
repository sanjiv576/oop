package chapter1_if_else_if;// Write a program to check weather a year is a leap or not.
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year;
        System.out.print("Enter the year: ");
        year = scan.nextInt();
        if (year % 4 == 0){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
