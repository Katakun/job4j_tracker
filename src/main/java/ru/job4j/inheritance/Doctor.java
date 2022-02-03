package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String name, String surname, String education, String birthday, String specialization) {
        super(name, surname, education, birthday);
        this.specialization = specialization;
    }

    public Doctor() {
    }

    public String receipt() {
        return "";
    }
}
