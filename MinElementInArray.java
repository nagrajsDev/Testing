package JavaTechnicalInteviewPrograms;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 10, 3, 7, 2};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum element in the array is " + min);
    }
}

