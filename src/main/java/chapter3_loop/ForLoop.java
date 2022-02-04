package chapter3_loop;

public class ForLoop {
    public static void main(String[] args) {


        // for-each loop example
        String[] arr = {"Nepal", "Bhutan", "India"};
        for (String element: arr){
            System.out.println(element);
        }

        // normal for loop example
        for(int i = 1; i < 101; i++){
            System.out.println(i);
        }


    }

}
