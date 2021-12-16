package chapter1;/*
6.	A student will not be allowed to sit in exam if his/her attendance is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

 */
import java.util.Scanner;
public class Exam {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int absentNum;
        int presentNum;

        System.out.print("Enter the number of classes absent: ");
        absentNum = object.nextInt();

        System.out.print("Enter the number of classes present: ");
        presentNum = object.nextInt();

        int attendance;
        attendance = (presentNum * 100) / (absentNum + presentNum);

        System.out.println("Percentage of class attended: " + attendance);
        if (attendance < 75 && attendance >= 0 ) {
            System.out.println("Sorry, the student is not allowed to sit in exam.");
        }
        else {
            System.out.println("The student is allowed to sit in exam.");
        }
    }
}
