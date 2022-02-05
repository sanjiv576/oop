package OOP_concept;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class EmployeeAll{
    public String fname;
    public String lname ;
    public String dob;

    public String displayFullName(){
        return fname + " " + lname;
    }

}
class FullTimeEmployee extends EmployeeAll{

    int monthlySalary;
    public int calculatSalary(){

        return monthlySalary * 12;
    }

}

class PartTimeEmployee extends EmployeeAll{
    int hourlySalary;
    int days;
    public int calculateSalary(){
        return hourlySalary * days * 12;
    }
}

// now, test class or driver class
class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PartTimeEmployee obj = new PartTimeEmployee();

        obj.fname = "Sanjiv";
        obj.lname = "Shrestha";

        System.out.println("Full name is : " + obj.displayFullName());
        obj.days = 201;
        obj.hourlySalary = 200;
        System.out.println("Part time employee annually salary : " + obj.calculateSalary());


        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        obj.fname = "Sagar";
        obj.lname = "Tamang";
        System.out.println("Full name is " +fullTimeEmployee.displayFullName());
        fullTimeEmployee.monthlySalary = 300;

        System.out.println("Full time employee : " + fullTimeEmployee.calculatSalary());






    }
}
