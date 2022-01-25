package chapter1_if_else_if;// Write a program to check weather a character is vowel or consonant.
import java.util.Scanner;
import java.lang.*;
public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter;
        System.out.print("Enter a character: ");
        letter = sc.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.print(letter + " is a vowel letter.");
        }
        else {
            System.out.print(letter + " is a consonant letter.");
        }
    }
}
