package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dictinory = new DummyDic();
        String rsl = dictinory.engToRus("Java");
        System.out.println(rsl);

    }
}
