package chapter1;// 8.	Write a program to check whether an entered character is lowercase (a to z) or uppercase (A to Z).
import java.util.Scanner;
public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char insertedCharacter;


        char quit = 'n';
        while (quit == 'n') {

            System.out.print("Give a character: ");
            insertedCharacter = sc.next().charAt(0);

            int asciiCode = insertedCharacter;
            System.out.println(asciiCode);

            // ASCII code range , a-z = 97-122, A-Z = 65-90
            if (asciiCode >= 65 && asciiCode <= 90) {
                System.out.println(insertedCharacter + " is uppercase.");

            } else if (asciiCode >= 97 && asciiCode <= 122) {
                System.out.println(insertedCharacter + " is lowercase.");

            } else {
                System.out.println("Wrong entry.");

            }

            System.out.println("\nDo you want to quit ? \nIf yes, type 'y', If no, type 'n' : ");
            quit = sc.next().charAt(0);
            if (quit == 'y') {
                break;
            }

        }


    }
}
