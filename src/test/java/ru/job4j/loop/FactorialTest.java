package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void thenCalculateFactorialForFiveThen120() {
        int result = Factorial.calc(5);
        int expected = 120;
        assertThat(result, is(expected));
    }

    @Test
    public void thenCalculateFactorialForOneThen1() {
        int result = Factorial.calc(1);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void thenCalculateFactorialForZeroThen1() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected));
    }
}