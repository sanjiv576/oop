package chapter5_array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Enter the size of array : ");
        num = scan.nextInt();

        int myArr[] = new int[num];
        for (int i = 0; i < myArr.length; i++){
            System.out.print("Enter the value at index " + i + " : ");
            myArr[i] = scan.nextInt();
        }
        System.out.println("Entered numbers : ");

        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}
