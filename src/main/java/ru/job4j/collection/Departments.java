package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                tmp.add((start += "/" + el).substring(1));
            }
        }
        return new ArrayList<>(tmp);
    }

    public static ArrayList<String> sortAsc(List<String> orgs) {
        Collections.sort(orgs);
        return new ArrayList<>(orgs);
    }

    public static ArrayList<String> sortDesc(List<String> orgs) {
        Collections.sort(orgs, new DepDescComp());
        return new ArrayList<>(orgs);
    }

    public static void main(String[] args) {
        List<String> rsl = Arrays.asList("K1/SK2", "K1/SK1/SSK1",
                "K2", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1/SK1", "K1/SK1/SSK2");
        rsl = Departments.fillGaps(rsl);
        System.out.println(Departments.sortDesc(rsl));
    }
}
