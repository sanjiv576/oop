package chapter1_if_else_if;

import java.util.Scanner;
public class TernaryOperatorExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter the number : ");

        num = sc.nextInt();

        // ternary operator ---> short form of if else statement
        String result = num % 2 == 0 ?  "even number " : "odd number";
        System.out.println(result);
    }
}
