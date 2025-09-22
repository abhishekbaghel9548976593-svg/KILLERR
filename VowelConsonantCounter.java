package hello;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "Hello World";
        countVowelsAndConsonants(input);
    }

    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}


	