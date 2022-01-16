package abstract_class;


public class Circle_1 extends Shape_1 {

    private float radius;
    Circle_1(float radius){

        this.radius = radius;
    }

    // this is implementation
    @Override
    protected float area() {
        return 3.14f * radius * radius;
    }
}
