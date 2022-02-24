package searching;

import java.util.Arrays;

// execute this
public class TestSearch {
    public static void main(String[] args) {

        int searchValue = 4;

        int[] array = { 2, 5, 6, 4, 3, 1};

        System.out.println("From Linear Search");
        Searching linearSearch = new LinearSearch();
        if (linearSearch.search(array, searchValue)){   // directly return type method/function
            System.out.println("found");
        }
        else {
            System.out.println("Not found");
        }

        System.out.println("\nFrom Binary Search");

        Sorting binarySearch = new BinarySearch();
        int[] sorted = binarySearch.sort(array);

        System.out.println(Arrays.toString(sorted));
    }
}
