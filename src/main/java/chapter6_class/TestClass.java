package chapter6_class;

public class TestClass {
    public static void main(String[] args){
        // creating an object and calling another class of the same package
        Student sanjiv = new Student();
        sanjiv.fname = "Sanjiv";
        sanjiv.lname = "Shresha";


        //System.out.println(sanjiv.fname + ' ' + sanjiv.lname);

        // show all information of Student class
        System.out.println(sanjiv);
        Student santosh = new Student();
        santosh.fname = "Santosh";
        santosh.lname = "Majhi";
        santosh.age = 23;
        // Note : Default value of int is 0 and String is null

        System.out.println(santosh.fname + ' ' + santosh.lname);
        System.out.println(santosh);
    }
}
