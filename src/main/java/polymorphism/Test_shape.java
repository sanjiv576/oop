package polymorphism;

// main class to execute
public class Test_shape {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Area of circle : " + circle.area(2));

        Shape rect = new Rectangle();
        System.out.println("Area of rectangle : " + rect.area(1.4f, 3.1f));

        Shape triangle = new Triangle();
        System.out.println("Area of triangle : " + triangle.area(4, 3));
    }
}
