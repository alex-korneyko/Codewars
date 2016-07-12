package ua.in.transceptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Korneyko on 11.07.2016.
 */
public class MaxTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, Max.sequence(new int[]{}));
    }

    @Test
    public void testExampleArray() throws Exception {
        assertEquals("Example array should have a max of 6", 6, Max.sequence(
                new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void testExampleArray2() throws Exception {
        assertEquals("Example array should have a max of 6", 19, Max.sequence(
                new int[]{2, 5, -1, 4, -5, -10, 3, 5, 10, -2, 3, -7, -2}));
    }

    @Test
    public void testExampleArray3() throws Exception {
        assertEquals("Example array should have a max of 6", 28, Max.sequence(
                new int[]{20, 5, -1, 4, -5, -10, -8, 3, 5, 10, -2, 3, -7, -2}));
    }

    @Test
    public void testExampleArray4() throws Exception {
        assertEquals("Example array should have a max of 6", 28, Max.sequence(
                new int[]{-2, -7, 3, -2, 10, 5, 3, -8, -10, -5, 4, -1, 5, 20}));
    }

}