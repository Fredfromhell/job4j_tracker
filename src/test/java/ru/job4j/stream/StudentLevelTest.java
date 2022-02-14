package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StudentLevelTest {

    @Test
    public void whenSorted() {
        List<StudentNewJDK> input = new ArrayList<>();
        input.add(new StudentNewJDK("Masha", 28));
        input.add(new StudentNewJDK("Pety", 128));
        List<StudentNewJDK> expected = List.of(
                new StudentNewJDK("Pety", 128),
                new StudentNewJDK("Masha", 28)
        );
        assertThat(StudentLevel.levelOf(input, 20), is(expected));
    }

    @Test
    public void whenOnlyNull() {
        List<StudentNewJDK> input = new ArrayList<>();
        input.add(null);
        List<StudentNewJDK> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 100), is(expected));
    }

    @Test
    public void whenHasNull() {
        List<StudentNewJDK> input = new ArrayList<>();
        input.add(null);
        input.add(new StudentNewJDK("Pety",28));
        List<StudentNewJDK> expected = List.of(new StudentNewJDK("Pety",28));
        assertThat(StudentLevel.levelOf(input, 10), is(expected));
    }
}