package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] allItem = new Item[items.length];
        for (int index = 0; index < size; index++) {
            Item test = items[index];
            if (test != null) {
                allItem[index] = test;
            }
            allItem = Arrays.copyOf(allItem, size);
        }
        return allItem;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] allItem = new Item[items.length];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item test = items[index];
            if (test.getName().equals(key)) {
                allItem[count] = test;
                count++;
            }
        }
            allItem = Arrays.copyOf(allItem, count);
            return allItem;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item first = new Item("first");
        Item second = new Item("second");
        tracker.add(first);
        tracker.add(first);
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("first"));
        tracker.add(new Item("second"));
        tracker.add(new Item("first"));

        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println(Arrays.toString(tracker.findByName("first")));
    }
}