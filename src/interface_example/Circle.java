package interface_example;

public class Circle implements Shape{


    private float radius;

    Circle(float radius){
        this.radius = radius;
    }
    @Override
    public float area() {
        return 3.14f * radius * radius;
    }

    @Override
    public String draw() {
        return "I am a circle";
    }
}
