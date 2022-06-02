package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает работу банковского счета, который хранит
 * некую сумму денег по определенному реквизиту
 * @author ALEXANDR IVANOV
 * @version 1.0
 */
public class Account {
    /**
     * Реквизит счета хранится в виде String
     */
    private String requisite;

    /**
     * Баланс счета храниться в виде Double
     */
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод сравнивает счета по их реквизитам.
     * @param o счет с которым происходит сравнение
     * @return возвращает true, если реквизиты счетов совпадают
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}