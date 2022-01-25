package unitTesting;

public class Arithmetic {
    private int first;
    private int second;

    // constructor
    public Arithmetic(int first , int second){
        this.first = first;
        this.second = second;
    }

    // unit testing
    public int add(){
        return this.first + this.second;
    }

    public int mul(){
        return this.first * this.second;
    }
}
