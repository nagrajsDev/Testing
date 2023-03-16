package JavaTechnicalInteviewPrograms;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;

        // check if the number is divisible by any number between 2 and the number itself
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

