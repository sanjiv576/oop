package OOP_concept;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class ParentClass{
    public String fname;
    public String lname ;
    public String dob;

}
class FullTimeEmployee extends ParentClass{

    public float MonthlySalary = 45000;
}
class PartTimeEmployee extends FullTimeEmployee{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PartTimeEmployee obj = new PartTimeEmployee();
        System.out.println(obj.MonthlySalary);
        System.out.println(obj.fname);

        String f_name, l_name, Dob;

        System.out.print("Enter your first name : ");
        f_name = sc.next();

        System.out.print("Enter your last name : ");
        l_name = sc.next();

        System.out.print("Enter your birthdate : ");
        Dob = sc.next();




    }
}
