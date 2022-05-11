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
        System.out.println("Есть ошибка: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error empty = new Error();
        empty.printInfo();
        System.out.println();
        Error notFound = new Error(true, 404, "Not found");
        notFound.printInfo();
        System.out.println();
        Error notAcceptable = new Error(true, 406, "Not acceptable");
        notAcceptable.printInfo();
    }
}
