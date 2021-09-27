package ru.job4j.oop;

public class AnyKey  {

    private boolean installation;

    public AnyKey(String name, String surname,
                  String education, String birthday, String typeOfWork, boolean installation) {
        this.installation = installation;
    }

    public boolean getInstallation() {
        return installation;
    }
}
