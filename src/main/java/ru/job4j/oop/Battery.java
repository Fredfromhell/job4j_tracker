package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int percent) {
        this.load = percent;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(50);
        first.exchange(second);
        System.out.println(first.load + "%");
        System.out.println(second.load + "%");
    }

}
