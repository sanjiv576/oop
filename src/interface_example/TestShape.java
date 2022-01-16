package interface_example;
public class TestShape {

    public static void main(String[] args) {

        Shape circle = new Circle(2.5f);
        System.out.println("Area of circle is " + circle.area());

        Shape triangle = new Triangle(4.5f, 4f);
        System.out.println("Area of triangle is " + triangle.area());
    }

}
