package ru.job4j.function;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

public class MathFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = MathFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQResults() {
        List<Double> result = MathFunction.diapason(5, 8, x -> x * x);
        List<Double> expected = Arrays.asList(25D, 36D, 49D);
        assertThat(result, is(expected));

    }

    @Test
    public void whenExponentialFunctionThenEResults() {
        List<Double> result = MathFunction.diapason(5, 8, x -> Math.pow(x, x));
        List<Double> expected = Arrays.asList(3125D, 46656D, 823543D);
        assertThat(result, is(expected));
    }
}