package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else {
            System.out.println(position == 2 ? "Спокойной ночи" : "Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox forKids = new Jukebox();
        int song = 5;
        forKids.music(song);
    }
}