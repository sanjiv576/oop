package searching;
// logic is here
public class LinearSearch implements Searching{

    // this is implementation
    @Override
    public boolean search(int[] arr, int searchValue) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){

            if (arr[i] == searchValue){
                flag = true;
                break;
            }
        }
        return flag;
    }

}
