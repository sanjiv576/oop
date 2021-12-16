package chapter1;/*
3.	A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.
 */

import java.util.Scanner;

public class Discount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int quantity;
        int costPerQuantity;
        int totalCost;

        System.out.print("Enter the quantity of the product: ");
        quantity = sc.nextInt();

        costPerQuantity = 100;

        totalCost = quantity * costPerQuantity;

        if (totalCost > 1000) {
            double discount = 0.1 * totalCost;
            System.out.print("Your total cost is " + (totalCost - discount) + " after " + discount + " discount.");

        }
        else {
            System.out.print("Your total cost is " + totalCost);
        }
    }
}