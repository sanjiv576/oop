package chapter4_function;

import java.util.Scanner;

public class HighestLowest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first_num;
        int second_num;
        int third_num;

        System.out.println("Enter the first number : ");
        first_num = sc.nextInt();

        System.out.println("Enter the second number : ");
        second_num = sc.nextInt();

        System.out.println("Enter the third number : ");
        third_num = sc.nextInt();

        int ansHighest = highest(first_num, second_num, third_num);
        int ansLowest = lowest(first_num, second_num, third_num);
        System.out.println("Lowest number is " + ansLowest + " and highest number is " + ansHighest);
    }
    public static int highest(int first, int second, int third){
        if (first > second && first > third){
            return first;
        }
        else if (second > third && second > first){
            return second;
        }
        else {
            return third;
        }
    }
    public static int lowest(int first, int second, int third){
        if (first < second && first < third){
            return first;
        }
        else if (second < third && second < first){
            return second;
        }
        else {
            return third;
        }
    }
}
