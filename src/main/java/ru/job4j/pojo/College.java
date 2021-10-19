package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Беспалов Алексей");
        student.setGrup("Java");
        student.setDateIn(new Date());

        System.out.println(student.getFio() + System.lineSeparator()
                + student.getGrup() + System.lineSeparator()
                + student.getDateIn());
    }

}
