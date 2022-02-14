package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
                if (task.getPriority() < element.getPriority()) {
                    break;
                }
            index++;
            }
        this.tasks.add(index, task);

        }

        public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        var test = new PriorityQueue();
        test.put(new Task("low", 5));
        test.put(new Task("urgent", 1));
        test.put(new Task("middle", 2));
        for (var rsl: test.tasks) {
            System.out.println(rsl.getPriority());

        }
    }
}