package ru.job4j.oop;

public class Bus  {

    private String timetable;

    public Bus(String name, String surname, String education, String birthday, String car, String timetable) {
        this.timetable = timetable;
    }

    public String getTimetable() {
        return timetable;
    }
}
