package mutable_immutable;
// immutable class by using final in front of class  --> NO setters here
public final class Immutable {  // model class

    private final int first;
    private final int second;


    // constructor
    public Immutable(int first, int second){
        this.first = first;
        this.second = second;
    }

    // getters

    public int getFirst(){
        return this.first;
    }

    public int getSecond(){
        return this.second;
    }

    // behaviour

    public int add(){
        return this.first + this.second;
    }
}
