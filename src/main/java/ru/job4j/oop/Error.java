package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();

        Error err1 = new Error(true, 15, "File not found");
        err1.printInfo();

        Error err2 = new Error(false, 4, "System off");
        err2.printInfo();

        Error err3 = new Error(true, 10, "Network not available");
        err3.printInfo();
    }
}
