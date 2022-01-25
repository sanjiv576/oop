package searching;

// execute this
public class TestSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int searchValue = 4;

        int[] array = {4, 2, 5, 6, 3, 1};

        System.out.println("From Linear Search");
        Searching linearSearch = new LinearSearch();
        if (linearSearch.search(array, searchValue)){   // directly return type method/function
            System.out.println("found");
        }
        else {
            System.out.println("Not found");
        }

        System.out.println("From Binary Search");

        Sorting binarySearch = new BinarySearch();
        //int[] sorted = binarySearch.sort(array);

        System.out.println(binarySearch.sort(array));
    }
}
