package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int qlt) {

    }

    @Override
    public int refuel(int qlt) {
        int price = 50;
        return price * qlt;

    }
}
