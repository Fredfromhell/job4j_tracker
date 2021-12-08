package ru.job4j.tracker;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemAscByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList (new Item("c", 3), new Item("b", 2), new Item("a", 1));
        Collections.sort(items, new ItemAscByName());
        List<Item> expected =  Arrays.asList(new Item("a", 1), new Item("b", 2), new Item("c", 3));
        assertThat(expected, is(items));
    }
}