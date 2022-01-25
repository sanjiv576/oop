package polymorphism;

// parent class
public class Shape {

    // method overloading ---> same name, diff signature

    // for area of circle
        public float area(int radius){
            return 3.14f * radius;
        }

        // for area of triangle
        public float area(int length, int breadth){
            return 0.5f * length * breadth;
        }

        // for area of rectangle
        public float area(float length, float breadth){
            return length * breadth;
        }

}
