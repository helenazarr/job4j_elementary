package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort3() {
        int[] input = new int[] {57, 103, 24};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {24, 57, 103};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[] {57, 103, 24, 19, 35};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {19, 24, 35, 57, 103};
        assertThat(result, is(expect));
    }
}