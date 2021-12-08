package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList (new Item("b", 2), new Item("a", 1), new Item("c", 3));
        Collections.sort(items, new ItemDescByName());
        List<Item> expected =  Arrays.asList(new Item("c", 3), new Item("b", 2), new Item("a", 1));
        assertThat(expected, is(items));
    }
}