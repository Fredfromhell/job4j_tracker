package ru.job4j.strategy;

public class Square   {
    public String draw() {
        String ln = System.lineSeparator();
        return "   --------    " + ln
                + "   |      |    " + ln
                + "   ________" + ln;
    }
}