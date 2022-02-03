package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String classificator;

    public Surgeon(String name, String surname, String education, String birthday, String specialization, String classificator) {
        super(name, surname, education, birthday, specialization);
        this.classificator = classificator;
    }

    public void operation() {
    }
}
