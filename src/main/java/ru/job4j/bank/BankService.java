package ru.job4j.bank;

import java.util.*;

/**
 * @author Bespalov Alexey
 * @version 0.1
 * Класс описывает сервис банка по созданию новых клиентов и счетов,
 * а так же позволяет делать переводы между счетами клиентов.
 * {@link User} Модель данных клиента банка
 * {@link Account} Модель данных счетов клиента
 */

public class BankService {
    /**
     * База данных по связке клиент-счета (хранение происходит в коллекции HashMap) .
     * У каждого клиента может быть неограниченное коллиечество счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход клиента и проверяет есть ли он в бд или нет с помощью встроенного в
     * Hashmap метода putIfAbsent (вставить в коллекнцию если нет).
     * @param user Клиент банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    /**
     * Метод принимает два параметра, пасопрт и счет. Если клиент есть в бд
     * и такого счета нет создается новый счет клиента.
     * @param passport Паспорт
     * @param account Счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> client = findByPassport(passport);
        if (client.isPresent() && !users.get(client.get()).contains(account)) {
            users.get(client.get()).add(account);
        }
    }

    /**
     * Метод принимает на вход номер паспорта и ищет его в бд.
     * @param passport Паспорт
     * @return Возвращает клиента или null если клиента с таким паспортом нет.
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**Метод принимает два параметра пасопрт и номер счета клиента.
     *Если клиент есть в бд, по ключу находим все счета.
     * @param passport Паспорт
     * @param requisite Номер счета
     * @return Возвращаем счет или Null
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> client = findByPassport(passport);
        return client.flatMap(user -> users.get(user).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод позводяет перевести деньги с одного счета на драгоуй при условии, что такие счета есть
     * и денег достаточно для перевода.
     * @param srcPassport Паспорт клиента с счета которого переводят деньги.
     * @param srcRequisite Счет клиента откуда переводят деньги
     * @param destPassport Паспорт клиента куда переводятся деньги
     * @param destRequisite Счет клиента куда переводятся деньги
     * @param amount Сумма перевода
     * @return Возвращает true в случае успешной операции и false в случае отказа.
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }

    /**
     * Тест в теле метода.
     * @param args
     */

    public static void main(String[] args) {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 20D);
        System.out.println(bank.findByRequisite("3434", "113").get().getBalance());
        System.out.println(bank.findByRequisite("3434", "5546").get().getBalance());
    }
}
