package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] one = o1.split("/");
        String[] two = o2.split("/");
        int rsl = two[0].compareTo(one[0]);
        return rsl == 0 ? o1.compareTo(o2) : rsl;
    }
}