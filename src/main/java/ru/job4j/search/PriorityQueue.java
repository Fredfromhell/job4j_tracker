package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        if (tasks.size() == 0) {
            this.tasks.add(index, task);
        } else {
            for (Task element : tasks) {
                if (task.getPriority() > element.getPriority()) {
                    index++;
                    break;
                }
                this.tasks.add(index, task);
            }
        }
    }

        public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        PriorityQueue test = new PriorityQueue();
        test.put(new Task("ВАЖНО", 1));
        test.put(new Task("Не очень ВАЖНО", 2));
        for (Task test2 : test.tasks) {
            System.out.println(test2.getDesc());
        }
    }
}