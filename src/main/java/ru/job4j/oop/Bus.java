package ru.job4j.oop;

public class Bus extends Driver {

    private String timetable;

    public Bus(String name, String surname, String education, String birthday, String car, String timetable) {
        super(name, surname, education, birthday, car);
        this.timetable = timetable;
    }

    public String getTimetable() {
        return timetable;
    }
}
