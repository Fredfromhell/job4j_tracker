package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        for (int i = 0; i < Math.min(left.length(), right.length()) - 1; i++) {
            int compare = Character.compare(left.charAt(i), right.charAt(i));
            if (compare != 0) {
                rsl = compare;
                break;

            }

        }
        return rsl != 0 ? rsl : Integer.compare(left.length(), right.length());
    }
}
