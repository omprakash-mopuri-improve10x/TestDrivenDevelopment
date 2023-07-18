package omprakash.tdd.stretchedword;

public class StretchedWord {

    public String getStretchedWord(String text) {
        String newText = "";
        if (text != null && text.length() > 0) {
            newText = String.valueOf(text.charAt(0));
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.toLowerCase().charAt(i) != text.toLowerCase().charAt(i + 1)) {
                    newText += text.charAt(i + 1);
                }
            }
        }
        return newText;
    }
}
