package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EqLastTest {

    @Test
    public void checkThenEqual() {
        int[] left = new int[] {1, 2, 3, 6};
        int[] right = new int[] {3, 4, 5, 9, 7, 6};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(true));
    }

    @Test
    public void checkThenNotEqual() {
        int[] left = new int[] {1, 2, 3, 6, 4};
        int[] right = new int[] {3, 4, 5, 9, 7, 6};
        boolean result = EqLast.check(left, right);
        assertThat(result, is(false));
    }
}