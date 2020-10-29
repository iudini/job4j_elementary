package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.EndsWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {

    @Test
    public void endsWithTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void endsWithFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'l'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}