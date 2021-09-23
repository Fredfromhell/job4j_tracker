package ru.job4j.oop;

public class Transportation extends Driver {

    private String cargo;

    public Transportation(String name, String surname,
                          String education, String birthday, String car, String cargo) {
        super(name, surname, education, birthday, car);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
