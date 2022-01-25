package chapter4_function;
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.println("1 ==> Addition");
        System.out.println("2 ==> Subtraction");
        System.out.println("3 ==> Multiplication ");
        System.out.println("4 ==> Division ");
        System.out.print("Enter the choice 1,2,3,4 : ");


        choice = sc.nextInt();
        System.out.print("Enter the first number : ");
        float first_num = sc.nextFloat();

        System.out.print("Enter the second number : ");
        float second_num = sc.nextFloat();
        float ans;
        switch (choice){
            case 1:
                ans = addition(first_num, second_num);
                System.out.println("Addition is : " + ans);
                break;
            case 2:
                ans = subtraction(first_num, second_num);
                System.out.println("Subtraction is : " + ans);
                break;
            case 3:
                ans = multiplication(first_num, second_num);
                System.out.println("Multiplication is : " + ans);
                break;
            case 4:
                ans = division(first_num, second_num);
                System.out.println("Division is : " + ans);
                break;
            default:
                System.out.println("Wrong entry. Try Again");
                break;
        }
    }
    public static float addition(float first, float second){
        return first + second;
    }

    public static float subtraction(float first, float second){
        return first - second;
    }
    public static float multiplication(float first, float second){
        return first * second;
    }
    public static float division(float first, float second){
        return first / second;
    }

}
