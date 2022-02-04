package chapter3_loop;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initialization value : ");
        int initialValue = sc.nextInt();

        int endValue;
        System.out.print("Enter the end value : ");
        endValue = sc.nextInt();

        while (initialValue != endValue){
            System.out.println(initialValue);
            initialValue++;
        }

    }
}
