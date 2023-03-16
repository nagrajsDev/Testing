package JavaTechnicalInteviewPrograms;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is " + result); // Output: The 7th Fibonacci number is 13
    }
}

