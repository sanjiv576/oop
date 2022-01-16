package abstract_class;

public class Triangle_1 extends Shape_1{


    private float length;
    private float breadth;

    Triangle_1(float length, float breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    protected float area() {
        return 0.5f * length * breadth;
    }
}
