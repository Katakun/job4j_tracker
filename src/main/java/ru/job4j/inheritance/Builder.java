package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String technology;

    public Builder(String name, String surname, String education, String birthday, String profile, String technology) {
        super(name, surname, education, birthday, profile);
        this.technology = technology;
    }

    public void makeHouse() {
    }
}
