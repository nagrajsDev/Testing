package JavaTechnicalInteviewPrograms;

import java.util.Arrays;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        return arr[n - 2];
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 8, 3, 7, 5};
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element in the array is: " + secondLargest); // Output: The second largest element in the array is: 7
    }
}

