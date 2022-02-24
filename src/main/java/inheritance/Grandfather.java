package inheritance;
// Example of Hybrid inheritance
interface Grandfather{
    String surname = "Shrestha";
    void fullName(String firstName);
}

interface Father extends Grandfather{
    String house = "House 4";
    //void fullName(String firstName);
    void property();
}

interface Mother extends Grandfather{
    // void fullName(String firstName);
    void love();
}

class Me implements Father, Mother{

    public void fullName(String firstName){

        System.out.println("My full name is " + firstName + " " + surname);
    }

    public void property(){
        String otherProperty = "Car 4, bike 2";
        System.out.println("Total property " + house + " " + otherProperty);

    }

    public void love(){
        System.out.println("Unconditional love");
    }

    public static void main(String[] args){
        Me me = new Me();
        me.fullName("Sanjiv");
        me.property();
        me.love();

    }
}