package searching;

public class BinarySearch implements Searching, Sorting{


    @Override
    public int[] sort(int[] arr) {

        int temp;
        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 0; i<arr.length-1; i++){
                if (arr[i] > arr[i+1]){
                    // now swapping the elements
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap = true;
                }
            }
        }
        return arr;
    }

    @Override
    public boolean search(int[] arr, int searchValue) {
        return false;
    }


}
