package chapter4_function;

import java.util.Scanner;

public class SimpleInterest {
    // main class
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int principal;
        float rate;
        float time;

        System.out.print("Enter the principal : ");
        principal = sc.nextInt();

        System.out.print("Enter the rate : ");
        rate = sc.nextFloat();

        System.out.print("Enter the time : ");
        time = sc.nextFloat();

        float ans = si(principal, rate, time);
        System.out.println("Simple interest is : " + ans);
    }
    // child class
    public static float si(int p, float r, float t){
        float  formula;
        formula = (p*t*r)/100;
        return formula;
    }
}
