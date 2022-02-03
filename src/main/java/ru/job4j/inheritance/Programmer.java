package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name, String surname, String education, String birthday, String profile, String language) {
        super(name, surname, education, birthday, profile);
        this.language = language;
    }

    public void makeSoft(String instruction) {
    }
}
