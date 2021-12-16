package chapter1;/*
Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 200 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill.
 */
import java.util.Scanner;
public class Electricity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float unit;
        System.out.print("Enter the unit of electricity: ");
        unit = sc.nextFloat();

        if (unit <= 50){
            System.out.print("Total electricity bill is " + (unit * 0.5));
        }
        else if (unit <= 100){
            System.out.print("Total electricity bill is " + (unit * 0.75));
        }
        else if (unit <= 200){
            System.out.println("Total electricity bill is " + (unit * 1.20));
        }
        else if (unit > 250){
            System.out.println("Total electricity bill is " + (unit * 1.50));
        }
        else {
            System.out.println("Total electricity bill is " + (unit * 0.2));
        }
    }
}
