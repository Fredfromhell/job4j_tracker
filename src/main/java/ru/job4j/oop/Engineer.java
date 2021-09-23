package ru.job4j.oop;

public class Engineer extends Profession {

    private String typeOfWork;

    public Engineer(String name, String surname, String education,
                    String birthday, String typeOfWork) {
        super(name, surname, education, birthday);
        this.typeOfWork = typeOfWork;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }
}
