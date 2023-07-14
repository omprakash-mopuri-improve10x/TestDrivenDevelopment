package omprakash.scoring.nameinverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameInverter {

    public String invertName(String name) {
        if (name.equals("")) {
            return "";
        } else if (!name.trim().contains(" ")) {
            return name.trim();
        } else {
            return getFormatedName(name);
        }
    }

    private static String getFormatedName(String name) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(name.split("\\s+")));
        removeHonorifics(names);
        String postNominal = getPostNominal(names.subList(2, names.size()));
        return (names.get(1) + " " + names.get(0) + " " + postNominal).trim();
    }

    private static String getPostNominal(List<String> names) {
        String postNominal = "";
        for (int i = 0; i < names.size(); i++) {
            postNominal += names.get(i) + " ";
        }
        return postNominal;
    }

    private static void removeHonorifics(ArrayList<String> names) {
        if (names.get(0).matches("Mrs.|Mr.|Miss") && names.size() > 2) {
            names.remove(0);
        }
    }
}
