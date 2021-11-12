package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {

    public static List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);

            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(ConvertMatrix2List.toList(new int[][] {{1, 2}, {3, 4}}));
    }
    }

