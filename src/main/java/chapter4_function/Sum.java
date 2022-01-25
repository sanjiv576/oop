package chapter4_function;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num;
        int second_num;
        int third_num;

        System.out.print("Enter the first number : ");
        first_num = sc.nextInt();

        System.out.print("Enter the second number : ");
        second_num = sc.nextInt();

        System.out.print("Enter the third number : ");
        third_num = sc.nextInt();
        int ans = sum(first_num, second_num, third_num);
        System.out.println("Sum is : " + ans);
    }
    public static int sum(int first, int second, int third){
        int result;
        result = first + second + third;
        return result;
    }
}
