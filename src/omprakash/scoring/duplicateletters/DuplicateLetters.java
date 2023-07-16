package omprakash.scoring.duplicateletters;

public class DuplicateLetters {

    public String printDuplicateLetters(String str) {
        StringBuilder duplicates = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] != ' ' && chars[i] == chars[j] && !duplicates.toString().contains(String.valueOf(chars[i]))) {
                    duplicates.append(chars[i]);
                }
            }
        }
        return duplicates.toString();
    }
}
