package ru.job4j.oop;

public class Driver extends Profession {

    private String car;

    public Driver(String name, String surname, String education, String birthday, String car) {
        super(name, surname, education, birthday);
        this.car = car;
    }

    public String type() {
        return car;
    }
}
