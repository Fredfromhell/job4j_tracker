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
        return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
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

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
        }

        return index != -1;
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
        System.out.println(tracker.replace(1, new Item("Проверка", 10)));
    }
}