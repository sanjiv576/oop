package polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Arithmetic {
    public static void main(String[] args) {
//        double firstNum, secondNum;
//        firstNum = 23.2;
//        secondNum = 12;
//        double ans = addition(firstNum, secondNum);
//        System.out.println(ans);

        System.out.println("---------------For addition-----------------");
        System.out.println(addition(5,3));
        System.out.println(addition(4.4f, 2));
        System.out.println(addition(5, 4.3f));
        System.out.println(addition(5.2f, 1.3f));

        System.out.println("----------------For area of circle----------------");

        System.out.println(circleArea(3));
        System.out.println(circleArea(2.4f));
    }

    // method overloading ----> same name , different signature
    public static int addition(int first, int second){
        return first + second;
    }

    public static float addition(int first, float second){
        return first + second;
    }

    public static float addition(float first, int second){
        return first + second;
    }

    public static float addition(float first, float second){
        return first + second;
    }


    // method overloading -- same name, diff signature
    public static float circleArea(int radius){
        return 3.14f * radius * radius;
    }

    public static float circleArea(float radius){
        return 3.14f * radius * radius;
    }
}
