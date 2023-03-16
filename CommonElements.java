package JavaTechnicalInteviewPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static Integer[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set2.add(arr2[i]);
        }

        set1.retainAll(set2);

        Integer[] result = new Integer[set1.size()];
        set1.toArray(result);

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Integer[] commonElements = findCommonElements(arr1, arr2);

        System.out.println(Arrays.toString(commonElements)); // Output: [3, 4, 5]
    }
}

