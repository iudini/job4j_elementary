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
    public void whenMax3to2Then2() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2to2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3n5n7Then7() {
        assertThat(Max.max(3, 5, 7), is(7));
    }

    @Test
    public void whenMax30n15n27Then30() {
        assertThat(Max.max(30, 15, 27), is(30));
    }

    @Test
    public void whenMax3n25n7Then7() {
        assertThat(Max.max(3, 25, 7), is(25));
    }

    @Test
    public void whenMax3n5n9n7Then7() {
        assertThat(Max.max(3, 5, 9, 7), is(9));
    }

    @Test
    public void whenMax30n10n15n27Then30() {
        assertThat(Max.max(30, 10, 15, 27), is(30));
    }

    @Test
    public void whenMax3n25n7n6Then7() {
        assertThat(Max.max(3, 25, 7, 6), is(25));
    }
}