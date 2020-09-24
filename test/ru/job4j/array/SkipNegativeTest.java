package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SkipNegativeTest {
    @Test
    public void skip() {
        int[][] in = {
                {2, -2},
                {-3, 1}
        };
        int[][] expect = {
                {2, 0},
                {0, 1}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}