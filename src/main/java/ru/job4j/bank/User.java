package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банка
 * @author ALEXANDR IVANOV
 * @version 1.0
 */
public class User {
    /**
     * Паспорт пользователя хранится в виде String
     */
    private String passport;

    /**
     * Имя пользователя храниться в виде String
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод сравнивает пользователей по паспорту.
     * Если паспорта совпадают, то возвращается true.
     * @param o пользователь с которым сравнивается этот пользователь
     * @return возвращает true если у пользователей одинаковые паспорта
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}