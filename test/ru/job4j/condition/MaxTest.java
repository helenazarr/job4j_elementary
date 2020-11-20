package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax24To28Then28() {
        int result = Max.max(24, 10, 28);
        assertThat(result, is(28));
    }

    @Test
    public void whenMax5To35Then35() {
        int result = Max.max(5, 35, 18, 24);
        assertThat(result, is(35));
    }

    @Test
    public void whenMax35To35Then35() {
        int result = Max.max(35, 35,35, 35);
        assertThat(result, is(35));
    }
}