package JavaTechnicalInteviewPrograms;
import java.util.*;


public class BubbleSortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 7}; // Change this to any array of integers you want to sort

        System.out.println("Original array: " + Arrays.toString(arr));

        int n = arr.length;
        // perform bubble sort to sort the array
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap the adjacent elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
