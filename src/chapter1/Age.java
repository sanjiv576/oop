package chapter1;

import java.util.Scanner;
// 5.	Take input of age of 3 people by user and determine oldest and youngest among them.
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_age;
        int second_age;
        int third_age;

        System.out.print("Enter the age of the first person: ");
        first_age = sc.nextInt();

        System.out.print("Enter the age of the second person: ");
        second_age = sc.nextInt();

        System.out.print("Enter the age of the third person: ");
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

----------------- DID NOT WORK -------------------
// int oldest = Math.max(first_age, second_age, third_age);

        if (first_age > second_age && first_age > third_age && second_age > third_age) {
            System.out.print("The first person is the oldest and third person is the youngest among them");
        }
        else if (second_age > first_age && second_age > third_age && third_age > first_age) {
            System.out.print("The second person is the oldest and first person is the youngest among them");
        }
        else if (third_age > first_age && third_age > second_age && first_age > second_age) {
            System.out.print("The third person is the oldest and second person is the youngest among them");
        }
        else {
            System.out.print("All people have the same age.");

        }
 */