package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {

    @Test
    public void backFor5() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] expect = new int[] {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(array);
        assertThat(rsl, is(expect));
    }

    @Test
    public void backFor6() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        int[] expect = new int[] {6, 5, 4, 3, 2, 1};
        int[] rsl = Turn.back(array);
        assertThat(rsl, is(expect));
    }
}