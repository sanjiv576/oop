package chapter6_class;

// class and constructor always be public
public class Student {
    String fname;
    String lname;
    int age;

    // this pass all infomartion to where it is invoked.
    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}
