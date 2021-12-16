package chapter1;

import java.util.Scanner;

public class Experiment {
    public static void main(String[] args) {
        int first_age , second_age, third_age;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age of first person: ");
        first_age = sc.nextInt();

        System.out.print("Enter the age of second person: ");
        second_age = sc.nextInt();

        System.out.print("Enter the age of third person: ");
        third_age = sc.nextInt();

        // x>y>z  and x<y<z , replace each one side by side in below conditions
        if ((first_age>second_age) && (second_age>third_age)) {
            System.out.print(" First and Third people are the oldest and youngest respectively, among them.");
        }
        else if ((first_age<second_age) && (second_age<third_age)) {
            System.out.print(" Third and First people are the oldest and youngest respectively, among them.");
        }
        else if ((second_age>third_age) && (third_age>first_age)) {
            System.out.print(" Second and First people are the oldest and youngest respectively, among them.");
        }
        else if ((second_age<third_age) && (third_age<first_age)) {
            System.out.print(" First and Second people are the oldest and youngest respectively, among them.");
        }
        else if ((third_age>first_age) && (first_age>second_age)) {
            System.out.print(" Third and Second people are the oldest and youngest respectively, among them.");
        }
        else {
            System.out.print(" Second and Third people are the oldest and youngest respectively, among them.");

        }

    }
}
/*
 if (((x>y) && (y>z)) || ((x>y) && (y<z))) {
            System.out.print(" First and Third people are the oldest and youngest respectively, among them.");
        }
 */
