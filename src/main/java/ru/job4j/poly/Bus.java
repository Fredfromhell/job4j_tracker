package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Drive bus");

    }

    @Override
    public void passengers(int qlt) {
        System.out.println("In bus " + qlt + " passengers");
    }

    @Override
    public int refuel(int qlt) {
        int price = 50;
        return price * qlt;

    }
}
