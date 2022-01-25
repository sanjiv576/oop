package chapter1_if_else_if;/*
6.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

7.	Modify the above question to allow student to sit if he/she has medical cause.
Ask user if he/she has medical cause or not (‘Y' or 'N’) and print accordingly.
 */

import java.util.Scanner;
import java.lang.*;
public class MedicalCause {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int absent, present, attendance;
        System.out.print("Enter the number of classes absent: ");
        absent = sc.nextInt();

        System.out.print("Enter the number of classes present: ");
        present = sc.nextInt();

        attendance = (present * 100) / (absent + present);
        System.out.println("Total attendance is " + attendance + "%");
        char medicalReason;
        System.out.print("\nDid you have any medical cause ? \nIf yes, type 'Y' , if no , type 'N' : ");

        // how we assign character from user by using .next().charAt(0);
        medicalReason = sc.next().charAt(0);
        System.out.println(Character.toUpperCase(medicalReason));

        // Truth table : yes v (no ^ attendance) , if yes = T, whatever the no, attendance is . Always gets executed this.
        // Note: if not understood, analyze truth table
        if ((Character.toUpperCase(medicalReason) == 'Y') || (Character.toUpperCase(medicalReason) == 'N' && attendance >= 75)){
            System.out.println("The student is allowed to sit in exam.");
        }
        // Truth table: yes v (no ^ attendance) , if yes = T then, no = F and vice-versa because as input 'y' or 'n', thus depends on  attendance condition after that
        else if ((Character.toUpperCase(medicalReason) == 'Y') || (Character.toUpperCase(medicalReason) == 'N' && attendance < 75)) {
            System.out.println("Sorry, the student is not allowed to sit in exam.");
        }
        else {
            System.out.println("Wrong entry. Try again.");
        }
    }
}