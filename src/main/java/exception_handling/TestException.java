package exception_handling;

public class TestException {
    public static void main(String[] args) {
        int num = 7;

        for (int i = -2; i < 3; i++){
            System.out.println(divideNumber(num, i));
        }
    }

    public static int divideNumber(int num, int i){

        try {  // generally, algorithms are in here which can throw exception
            return num/i;
        }
        catch(ArithmeticException e){   // catches error
            System.out.println("Error found");
            return 0;
        }
        finally{
            System.out.println("Inside finally");
        }

    }
}
