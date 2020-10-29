package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {

    @Test
    public void startsWithPrefixTrue() {
        char[] word = new char[] {'S', 'c', 'h', 'o', 'o', 'l'};
        char[] pref = new char[] {'S', 'c', 'h'};
        boolean rsl = ArrayChar.startsWith(word, pref);
        assertThat(rsl, is(true));
    }

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}