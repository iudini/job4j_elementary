package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.loop.Mortgage;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {

    @Test
    public void when4Year() {
        int result = Mortgage.year(100, 70, 50);
        assertThat(result, is(4));
    }

    @Test
    public void when10Year() {
        int result = Mortgage.year(900, 150, 10);
        assertThat(result, is(10));
    }

    @Test
    public void when1Year() {
        int year = Mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}