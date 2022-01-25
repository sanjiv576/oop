package chapter1_if_else_if;/*
Write a program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
 */
import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float basicSalary;

        // String pricePattern = "0,00,00,000.00";
        // DecimalFormat decimalFormat = new DecimalFormat(pricePattern);
        System.out.print("Enter the basic salary: ");
        basicSalary = sc.nextFloat();
        double totalSalary;
        if (basicSalary <= 10000){
            totalSalary = (0.2 * basicSalary) + (0.8 * basicSalary);
            System.out.println("Total salary is : " + totalSalary);
        }
        else if (basicSalary <= 20000){

            totalSalary = (0.25 * basicSalary) + (0.9 * basicSalary);
            System.out.println("Total salary is : " + totalSalary);
        }
        else {
            totalSalary = (0.3 * basicSalary) + (0.95 * basicSalary);
            System.out.println("Total salary is : " + totalSalary);
        }
    }
}
