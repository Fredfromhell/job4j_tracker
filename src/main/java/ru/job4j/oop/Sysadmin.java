package ru.job4j.oop;

public class Sysadmin extends Engineer {

    private String error;

    public Sysadmin(String name, String surname, String education,
                    String birthday, String typeOfWork, String error) {
        super(name, surname, education, birthday, typeOfWork);
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
