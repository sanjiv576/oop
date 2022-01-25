package mutable_immutable;


public class SimpleInterest {

    public float principal;
    public float rate;
    public float time;

    public SimpleInterest(){

    }

    // constructor
    public SimpleInterest(float p, float r, float t){
        this.principal = p;
        this.rate = r;
        this.time = t;
    }

    public void setPrincipal(float principal){
        if (principal <= 0){
            throw new IllegalArgumentException("Principal cannot be equal or less than 0");
        }
        this.principal = principal;
    }

    public void setRate(float rate){
        if (rate <= 0){
            throw new IllegalArgumentException("Rate cannot be equal or less than 0");
        }
        this.rate = rate;
    }

    public void setTime(float time){
        if (time <= 0){
            throw new IllegalArgumentException("Time cannot be equal or less than 0");
        }
        this.time = time;
    }

}
