package chapter1_if_else_if;

import java.util.Scanner;
public class DetermineGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        boolean male;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Are you Male ? ");
        male = sc.nextBoolean();

        if (age > 20) {
            if (male) {
                System.out.println("Man");
            }
            else {
                System.out.println("Women");
            }
        } else {
            if (male) {
                System.out.println("Boy");
            } else {
                System.out.println("Girl");
            }
        }
    }
}
/*
Next logic

if (male) {
    if (age > 20) {
        System.out.print("Man");
        }
    else {
        System.out.print("Boy");
    }
else {
    if (age > 20) {
        System.out.print("Women");
        }
        else {
        System.out.print("Girl");
        }
}
 */

