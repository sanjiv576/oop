package chapter1;// 8.	Write a program to check whether an entered character is lowercase (a to z) or uppercase (A to Z).

import java.util.Scanner;
import java.lang.*;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter;

        System.out.print("Give a character: ");
        letter = sc.next().charAt(0);

        // checks uppercase or not, if uppercase then, upperCase = true, otherwise upperCase = false
        // Note, uppercase stores boolean value i.e. true or false
        boolean upperCase = Character.isUpperCase(letter);

        // converts Boolean value to String data type
        String converted = Boolean.toString(upperCase);

        if (converted == "true") {
            System.out.print(letter + " is uppercase.");
        }
        else {
            System.out.print(letter + " is lowercase.");
        }

    }
}
