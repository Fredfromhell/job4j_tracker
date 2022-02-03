package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MathFunction {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> rsl = new ArrayList<>();
        double count = 0D;
        for (int i = start; i < end; i++) {
            count = count + i;
            rsl.add(func.apply(count));
            count = 0;
        }
        return rsl;

    }
}
