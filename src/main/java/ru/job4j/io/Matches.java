package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 0 && matches <= 3) {
                if (count - matches < 0) {
                    System.out.println("Нельзя взять больше " + count + " спичек.");
                } else {
                    turn = !turn;
                    System.out.println(player + " Вытащил " + matches + " спичек . "
                            + "Осталось " + (count - matches) + " спичек.");
                    count -= matches;
                }

            } else {
                System.out.println("Ошибка ввода, введите число от 1 до 3");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
