package OOP_concept;

// parent class
class Employee {
    float salary = 40000;
    float dahainSalary = 40000;
}

// child class
class Programmer extends Employee{
    int bonus = 10000;
    public static void main(String[] args) {

        // creating instance of class
        Programmer obj = new Programmer();

        // accessing property from parent class
        System.out.println("Salary of Programmer from parent class : " + obj.salary);
        System.out.println("Bonus of Programmer : " + obj.bonus);

        float totalSalary = obj.salary + obj.dahainSalary + obj.bonus;
        System.out.println("Total salary of Programmer for this month : " + totalSalary);
    }
}
