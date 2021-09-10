package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка активна: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);

    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error errorSQL = new Error(true, 1, "База данных не найдена");
        errorSQL.printInfo();
    }
}