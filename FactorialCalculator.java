package JavaTechnicalInteviewPrograms;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // Change this to any number for which you want to calculate the factorial

        int factorial = 1;
        // Calculate factorial of the number
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}

