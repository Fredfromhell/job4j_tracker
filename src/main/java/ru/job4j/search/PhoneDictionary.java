package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> name = s -> s.getName().contains(key);
        Predicate<Person> surname = s -> s.getSurname().contains(key);
        Predicate<Person> phone = s -> s.getPhone().contains(key);
        Predicate<Person> address = s -> s.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (name.or(surname).or(phone).or(address).test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
