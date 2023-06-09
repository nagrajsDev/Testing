package JavaTechnicalInteviewPrograms;
public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
        boolean isPalindrome = true;

        // iterate through the string and compare the characters at each end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}

