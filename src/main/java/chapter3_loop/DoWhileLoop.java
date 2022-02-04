package chapter3_loop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initialization value : ");
        int initialValue = sc.nextInt();

        int endValue;
        System.out.print("Enter the end value : ");
        endValue = sc.nextInt();

        do{
            System.out.println(initialValue);
            initialValue++;
        } while(initialValue <= endValue);
    }
}
