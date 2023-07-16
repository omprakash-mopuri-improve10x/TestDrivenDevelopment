package omprakash.scoring.removevowels;

public class RemoveVowels {

    public static String removeVowels(String text) {
        String result = text;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' | c == 'A' | c == 'e' | c == 'E' | c == 'i' | c == 'I' | c == 'o' | c == 'O' | c == 'u' | c == 'U') {
                result = result.replace(String.valueOf(c), "");
            }
        }
        return result;
    }
}