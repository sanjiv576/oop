package chapter5_array;
import java.util.Scanner;
public class DistrictInput {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_of_district;
        System.out.print("Enter the number of districts : ");

        num_of_district = sc.nextInt();

        String arr[] = new String[num_of_district];

        for (int i = 0; i < num_of_district; i++){
            System.out.println("Enter the name of district at index " + i + " : ");
            arr[i] = sc.next();
        }

        System.out.println("A list of inserted districts is : ");

        for (int i = 0; i < num_of_district; i++){
            System.out.println(arr[i]);
        }
    }
}
