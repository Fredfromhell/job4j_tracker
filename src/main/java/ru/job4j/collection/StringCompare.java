package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        if (left.length() > right.length()) {
            rsl = 1;
        }
        if (left.length() < right.length()) {
            rsl = -1;
        }

        for (int i = 0; i < left.length() - 1 && i < right.length() - 1; i++) {
            if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                rsl = Character.compare(left.charAt(i), right.charAt(i));
                break;

            }

        }
        return rsl;
    }
}
