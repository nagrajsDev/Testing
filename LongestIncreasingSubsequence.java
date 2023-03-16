package JavaTechnicalInteviewPrograms;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] array = {10, 22, 9, 33, 21, 50, 41, 60};
        int[] lis = new int[array.length];
        int maxLength = 1;
        for (int i = 0; i < array.length; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            if (lis[i] > maxLength) {
                maxLength = lis[i];
            }
        }
        System.out.println("The length of the longest increasing subsequence is " + maxLength);
    }
}

