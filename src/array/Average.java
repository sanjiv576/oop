package array;

import java.util.Scanner;

public class Average {
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
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Average value from the list is : " + sum/size);
    }
}
