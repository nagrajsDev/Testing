package JavaTechnicalInteviewPrograms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        int result = linearSearch(array, target);
        if (result == -1) {
            System.out.println("Element not present in the array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

