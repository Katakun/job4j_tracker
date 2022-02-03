package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String profile;

    public Dentist(String name, String surname, String education, String birthday, String specialization, String profile) {
        super(name, surname, education, birthday, specialization);
        this.profile = profile;
    }

    public void healCaries() {
    }
}
