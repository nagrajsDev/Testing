package JavaTechnicalInteviewPrograms;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Change this to the first array
        int[] arr2 = {3, 4, 5, 6, 7}; // Change this to the second array

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        // find the intersection of the two arrays
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    intersection[index++] = arr1[i];
                    break;
                }
            }
        }

        // resize the intersection array if necessary
        if (index < intersection.length) {
            intersection = Arrays.copyOf(intersection, index);
        }

        System.out.println("Intersection: " + Arrays.toString(intersection));
    }
}

