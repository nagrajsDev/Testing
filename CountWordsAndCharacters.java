package JavaTechnicalInteviewPrograms;

public class CountWordsAndCharacters {
    public static void countWordsAndCharacters(String str) {
        int wordCount = 0;
        int charCount = 0;
        boolean isWord = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c)) {
                isWord = false;
            } else if (!isWord) {
                wordCount++;
                isWord = true;
            }

            charCount++;
        }

        System.out.println("Word count: " + wordCount);
        System.out.println("Character count: " + charCount);
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        countWordsAndCharacters(str); // Output: Word count: 9, Character count: 44
    }
}
