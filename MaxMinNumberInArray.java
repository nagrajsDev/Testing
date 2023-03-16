package JavaTechnicalInteviewPrograms;

public class MaxMinNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 3, 5};
        int max = numbers[0]; // assume the first number is the maximum
        int min = numbers[0]; // assume the first number is the minimum

        // iterate through the array and update the max and min variables
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}

