package chapter1;/*
Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */
import java.util.Scanner;
public class GradeSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float physicsMarks, chemistryMarks, biologyMarks, mathsMarks, computerMarks;

        System.out.print("Enter the marks of Physics: ");
        physicsMarks = sc.nextFloat();

        System.out.print("Enter the marks of Chemistry: ");
        chemistryMarks = sc.nextFloat();

        System.out.print("Enter the marks of Biology: ");
        biologyMarks = sc.nextFloat();

        System.out.print("Enter the marks of Marks: ");
        mathsMarks = sc.nextFloat();

        System.out.print("Enter the marks of Computer: ");
        computerMarks = sc.nextFloat();

        float percentage;
        percentage = (physicsMarks + chemistryMarks + biologyMarks + mathsMarks + computerMarks)/5;

        if (percentage >= 90 && percentage <= 100){
            System.out.println("Percentage is " + percentage + " and grade is A");
        }
        else if (percentage >= 80){
            System.out.println("Percentage is " + percentage + " and grade is B");
        }
        else if (percentage >= 70){
            System.out.println("Percentage is " + percentage + " and grade is C");
        }
        else if (percentage >= 60){
            System.out.println("Percentage is " + percentage + " and grade is D");
        }
        else if (percentage >= 40){
            System.out.println("Percentage is " + percentage + " and grade is E");
        }
        else if (percentage < 40 && percentage >= 0 ){
            System.out.println("Percentage is " + percentage + " and grade is F");
        }
        else {
            System.out.println("Wrong entry. Try again.");
        }
    }
}
