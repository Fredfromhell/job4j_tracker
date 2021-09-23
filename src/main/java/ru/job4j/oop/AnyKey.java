package ru.job4j.oop;

public class AnyKey extends Engineer {

    private boolean installation;

    public AnyKey(String name, String surname,
                  String education, String birthday, String typeOfWork, boolean installation) {
        super(name, surname, education, birthday, typeOfWork);
        this.installation = installation;
    }

    public boolean getInstallation() {
        return installation;
    }
}
