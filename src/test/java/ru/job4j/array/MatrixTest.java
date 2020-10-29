package ru.job4j.array;

import org.junit.Test;
import ru.job4j.array.Matrix;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {

    @Test
    public void multiple() {
        int size = 4;
        int[][] expect = {
                {1, 2, 3, 4},
                {2, 4, 6, 8},
                {3, 6, 9, 12},
                {4, 8, 12, 16}
        };
        int[][] rsl = Matrix.multiple(size);
        assertThat(rsl, is(expect));
    }
}