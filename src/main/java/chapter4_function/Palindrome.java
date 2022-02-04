package chapter4_function;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        char quit;
        do {
            System.out.print("Enter the numbers : ");
            num = sc.nextInt();

            int temp = num;
            int ans = palindromeCheck(num);

            if (ans == temp) {
                System.out.println(num + " is a palindrome number.");
            }
            else {
                System.out.println(num + " is not a palindrome number.");
            }

            System.out.print("\n Do you want to quit ? (y/n) ");
            quit = sc.next().toLowerCase().charAt(0);
        } while (quit == 'n');
    }
    public static int palindromeCheck(int num){
       // int length = num;
        int rem;
        int palindrome = 0;

        while (num != 0){
            rem = num % 10;
            palindrome = (palindrome * 10) + rem;
            num /= 10;
        }
        return palindrome;
    }
}
