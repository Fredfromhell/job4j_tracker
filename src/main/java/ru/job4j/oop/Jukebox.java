package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else {
            if (position != 2) {
                System.out.println("Песня не найдена");
            } else {
                System.out.println("Спокойной ночи");
            }
        }
    }

    public static void main(String[] args) {
        Jukebox forKids = new Jukebox();
        int song = 2;
        forKids.music(song);
    }
}