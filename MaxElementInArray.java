package JavaTechnicalInteviewPrograms;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 7, 2};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum element in the array is " + max);
    }
}

