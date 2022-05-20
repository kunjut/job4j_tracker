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

    public Item findById(int id) {
        int index = indexOf(id);
        return (index != -1) ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[j++] = items[i];
            }
        }
        return Arrays.copyOf(result, j);
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
               result = index;
               break;
            }
        }
        return result;
    }

    public boolean replace(int id, Item item) {
        if (!isValid(id) || !isValid(item)) {
            return false;
        }
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        item.setId(id);
        items[index] = item;
        return true;
    }

    public boolean delete(int id) {
        if (!isValid(id)) {
            return false;
        }
        int index = indexOf(id);
        if (index == -1) {
            return false;
        }
        System.arraycopy(items, index + 1, items, index, size - 1 - index);
        items[size - 1] = null;
        size--;
        return true;
    }

    private boolean isValid(int id) {
        if (id < 1) {
            System.err.println("Передан некорректный аргумент: " + id + ", id должен быть >= 1");
            return false;
        }
        return true;
    }

    private boolean isValid(Item item) {
        if (item == null) {
            System.err.println("В item передан null, нужен корректный объект");
            return false;
        }
        return true;
    }
}
