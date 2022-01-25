package searching;

public class BinarySearch implements Searching, Sorting{


    @Override
    public int[] sort(int[] array) {

        boolean swap = true;
        while (swap){
            swap = false;
            for (int i = 0; i<array.length-1; i++){
                if (array[i] > array[i+1]){
                    // now swapping the elements
                    array[i] = array[i+1];
                    array[i+1] = array[i];
                    swap = true;
                }
            }
        }

        System.out.println(array);
        return array;
    }

    @Override
    public boolean search(int[] arr, int searchValue) {
        return false;
    }


}
