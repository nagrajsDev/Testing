package JavaTechnicalInteviewPrograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int count = 10; // Change this to the number of terms you want to generate in the series
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci series up to " + count + " terms: ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(firstTerm + " ");

            // compute the next term by adding the previous two terms
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

