package chapter0_basic_in_java;

import java.util.Scanner;

public class StringConcept {
    public static void main(String[] args){

        // creating string using new keyword
        String msg = new String("String Concept");
        System.out.println(msg);

        Scanner scan = new Scanner(System.in);
        String f_name, l_name;
        System.out.print("Enter your first name : ");
        f_name = scan.next();

        System.out.print("Enter your las name : ");
        l_name = scan.next();

        // get the length of first name using .length() function
        int lenFname = f_name.length();
        System.out.println("Length of the first name : " + lenFname);

        // concat of first and last name using .concat() function
        System.out.println("Concatenation of first and last name is : " + f_name.concat(l_name));

        // comparing two strings using .equals() function
        boolean comparing = f_name.equals(l_name);  // stores in boolean true or false value
        System.out.println("first and last name are the same : " + comparing);

        // converting first name string into lower case using .toLowerCase()
        System.out.println("First name in lower case : " + f_name.toLowerCase());

        // converting first name string into upper case using toUpperCase()
        System.out.println("First name in Upper case : " + f_name.toUpperCase());


    }
}
