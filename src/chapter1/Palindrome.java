package chapter1;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();
        //int first_rem = 0;
        int rem;
        int qut;
        rem = num % 10;

        qut = num / 10;
        int palindrome;
        palindrome = (rem * 10) + qut;

        if (palindrome == num) {
            System.out.println(num + " is a palindrome number.");
        }
        else {
            System.out.println(num + " is not palindrome number.");
        }

    }
}
