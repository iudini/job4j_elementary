package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void thenExist() {
        int[] data = new int[] {5, 3, 0, 12, 17};
        int el = 12;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(3));
    }

    @Test
    public void thenNotExist() {
        int[] data = new int[] {2, 12, 85, 0, 6};
        int el = 3;
        int result = FindLoop.indexOf(data, el);
        assertThat(result, is(-1));
    }
}