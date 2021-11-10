package ru.job4j.search;

import org.junit.Test;
import ru.job4j.ex.UserNotFoundException;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() throws UserNotFoundException {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(new Person("1", "2", "3", "4"));
        ArrayList<Person> persons = phones.find("etr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }

    @Test
    public void whenDontFind() throws UserNotFoundException {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(new Person("1", "2", "3", "4"));
        ArrayList<Person> persons = phones.find("tset");
        assertTrue(persons.isEmpty());

    }
}