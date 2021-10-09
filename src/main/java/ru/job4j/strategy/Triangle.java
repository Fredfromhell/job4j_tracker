package ru.job4j.strategy;

public class Triangle   {
    public String draw() {
        String ln = System.lineSeparator();
        return "   ^    " + ln
                + " /   \\ " + ln
                + "/_____\\" + ln;
    }
}