package chapter1_if_else_if;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter;
        System.out.print("Enter a character: ");
        letter = sc.next().toLowerCase().charAt(0);

        switch (letter){
            case 'a':
                System.out.println("chapter1.Vowel");
                break;
            case 'e':
                System.out.println("chapter1.Vowel");
                break;
            case 'i':
                System.out.println("chapter1.Vowel");
                break;
            case 'o':
                System.out.println("chapter1.Vowel");
                break;
            case 'u':
                System.out.println("chapter1.Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;

        }
    }
}
