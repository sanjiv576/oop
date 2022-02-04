package chapter5_array;

import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the value at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum value from the list is : " + min);
    }
}
