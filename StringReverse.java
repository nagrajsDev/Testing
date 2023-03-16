package JavaTechnicalInteviewPrograms;
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = "";

        // iterate through the string backwards and add each character to a new string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}
