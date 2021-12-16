package array;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int num = scan.nextInt();
        String[] myArr = new String[num];
        for (int i = 0; i < myArr.length; i++){
            System.out.println("Enter the name at index " + i + " : ");
            myArr[i] = scan.next();
        }
        System.out.println("Array list: ");
        for (int i = 0; i < myArr.length; i++){
            System.out.println(myArr[i]);
        }


    }
}
