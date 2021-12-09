package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] lNom = left.split("\\.");
        String[] rNom = right.split("\\.");
        int leftNom = Integer.parseInt(lNom[0]);
        int rightNom = Integer.parseInt(rNom[0]);
        return Integer.compare(leftNom, rightNom);

     }
}
