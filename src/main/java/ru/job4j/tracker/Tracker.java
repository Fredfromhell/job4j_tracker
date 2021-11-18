package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private final ArrayList<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        size++;
        return item;
    }

    public ArrayList<Item> findAll() {
        return items;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
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
        return index != -1 ? items.get(index) : null;
    }

    public Item[] findByName(String key) {
        Item[] allItem = new Item[items.size()];
        int count = 0;
        for (int index = 0; index < size; index++) {
            Item test = items.get(index);
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
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items.set(index, item);
        }

        return rsl;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
            size--;
        }
        return rsl;
    }
}

