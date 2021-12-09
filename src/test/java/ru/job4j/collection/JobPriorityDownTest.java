package ru.job4j.collection;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobPriorityDownTest {

    @Test
    public void compare() {
        List<Job> jobs = Arrays.asList(new Job("d", 0), new Job("c", 2),
                new Job("b", 4), new Job("a", 1));
        Collections.sort(jobs, new JobPriorityDown());
        List<Job> expected =Arrays.asList (new Job("b", 4), new Job("c", 2),
                new Job("a", 1), new Job("d", 0));
        assertThat(expected, is(jobs));

    }

}