package chapter6_class;

public class Student_2 {
    private String fname;
    private String lname;
    private int age;

    // we make constructor to access private data i.e. fname, lname, age
    public Student_2(String fname, String lname, int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student_2{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
