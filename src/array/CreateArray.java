package array;

import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Array is a collection of data of fix size.
        // declaring array
        int[] arr;  // or int arr[]
        // allocating memory with size
        arr = new int[3];  // size is 3 here

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter the number at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array list: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
