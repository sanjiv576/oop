package chapter1_if_else_if;
/*
4.	A school has the following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float marksPercentage;
        System.out.print("Enter the percentage of a student: ");
        marksPercentage = sc.nextFloat();

        if (marksPercentage < 25 && marksPercentage > 0) {
            System.out.println("The student grade is F");
        }
        else if (marksPercentage >= 25 && marksPercentage < 45) {
            System.out.println("The student grade is E");
        }
        else if (marksPercentage >= 45 && marksPercentage < 50) {
            System.out.println("The student grade is D");
        }
        else if (marksPercentage >= 50 && marksPercentage < 60) {
            System.out.println("The student grade is C");
        }
        else if (marksPercentage >= 60 && marksPercentage < 80) {
            System.out.println("The student grade is B");
        }
        else if (marksPercentage >= 80 && marksPercentage <= 100) {
            System.out.println("The student grade is A");
        }
        else {
            System.out.println("Wrong Entry.");
        }
    }
}