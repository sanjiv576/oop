package abstract_class;

public class TestShape_1 {
    public static void main(String[] args) {

        Shape_1  circle = new Circle_1(3.5f);
        System.out.println("Area of circle : " + circle);

        Shape_1 triangle = new Triangle_1(3.5f, 5.5f);
        System.out.println("Area of triangle : " + triangle);
    }
}
