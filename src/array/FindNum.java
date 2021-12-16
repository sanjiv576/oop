package array;

import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        System.out.print("Give the size of the array : ");
        size = scan.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter the value at index " + i + " : ");
            myArray[i] = scan.nextInt();
        }
        int findNum;
        boolean got = false;
        System.out.print("Enter the number to find in the array : ");
        findNum = scan.nextInt();

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] == findNum){
                got = true;
                break;
            }
        }
        if (got){
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
