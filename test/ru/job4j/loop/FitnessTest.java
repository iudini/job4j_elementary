package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void thenIvan90Nik100Then1() {
        int result = Fitness.calc(90, 100);
        assertThat(result, is(1));
    }

    @Test
    public void thenIvan60Nik100Then2() {
        int result = Fitness.calc(60, 100);
        assertThat(result, is(2));
    }

    @Test
    public void thenIvan90Nik90Then0() {
        int result = Fitness.calc(90, 90);
        assertThat(result, is(1));
    }

    @Test
    public void thenIvan90Nik70Then0() {
        int result = Fitness.calc(90, 70);
        assertThat(result, is(0));
    }
}