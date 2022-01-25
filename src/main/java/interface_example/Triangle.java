package interface_example;

public class Triangle implements Shape{

    private float base;
    private float height;

    Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    @Override
    public float area() {
        return 0.5f * base * height;
    }

    @Override
    public String draw() {
        return null;
    }
}
