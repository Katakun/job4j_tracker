package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу простейшего банка, в котором клиенты
 * могут переводить деньги с одного счета на другой
 * @author ALEXANDR IVANOV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение пользователей и их счетов осуществляется
     * в коллекции типа HashMap, ключом является пользователь,
     * к которому ассоциируется список его счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет клиента в список клиентов банка,
     * только в случае, если его еще нет в этом списке.
     * @param user клиент, которого надо добавить в список.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет счет клиенту, при условии, что у него еще нет этого счета.
     * @param passport паспорт клиента нужен для поиска этого клиента.
     * @param account счет для добавления в список счетов пользователя.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод находит клиента в списке клиентов по паспорту
     * @param passport паспорт нужного клиента
     * @return возвращает найденного клиента
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (passport.equals(user.getPassport())) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод находит счет определенного клиента по его паспорту
     * @param passport паспорт клиента
     * @param requisite реквизиты счета клиента
     * @return возвращает найденный счет либо null
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (requisite.equals(account.getRequisite())) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод сперва находит заданные счета по реквизитам и паспортам,
     * затем переводит сумму денег с одного счета на другой.
     * @param srcPassport паспорт отправителя денег
     * @param srcRequisite счет отправителя денег
     * @param destPassport паспорт получателя денег
     * @param destRequisite счет получателя денег
     * @param amount сумма перевода
     * @return в случае успеха возвращает true, иначе false
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (srcAccount != null
                && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}