package chapter6_class;

public class Calculations {
    private float first;
    private float second;
    private float third;

    // constructor to pass private values
    public Calculations(float first, float second, float third){
        this.first = first;
        this.second = second;
        this.third = third;

        float sum = addition(first, second, third);
        System.out.println("Addition is : " + sum);

        float sub = subtraction(first, second, third);
        System.out.println("Subtraction is : " + sub);

        float mul = multiplication(first, second, third);
        System.out.println("Multiplication is : " + mul);

        float div = division(first, second, third);
        System.out.println("Division is : " + div);

    }

    public static float addition(float first, float second, float third){
        return (first+second+third);
    }

    public static float subtraction(float first, float second, float third){
        return (first-second-third);
    }

    public static float division(float first, float second, float third){
        return (first/second);
    }

    public static float multiplication(float first, float second, float third){
        return (first*second*third);
    }

    @Override
    public String toString() {
        return "Done";
    }
}
