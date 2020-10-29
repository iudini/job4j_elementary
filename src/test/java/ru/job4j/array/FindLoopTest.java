package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.FindLoop;

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

    @Test
    public void indexOfRangeTrue() {
        int[] data = new int[] {2, 12, 85, 0, 6, 12, 24, 2, 6};
        int el = 6;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        assertThat(result, is(4));
    }

    @Test
    public void indexOfRangeFalse() {
        int[] data = new int[] {2, 12, 85, 0, 6, 12, 24, 2, 6};
        int el = 13;
        int start = 0;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        assertThat(result, is(-1));
    }
}