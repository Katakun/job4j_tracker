package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String portfolio;

    public Engineer(String name, String surname, String education, String birthday, String portfolio) {
        super(name, surname, education, birthday);
        this.portfolio = portfolio;
    }

    public int calculation(int smeta) {
        return -1;
    }
}
