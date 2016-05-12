package ua.in.transceptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Korneyko on 12.05.2016.
 */
public class DigitizeTest {

    @Test
    public void testDigitize1() throws Exception {

        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Digitize.digitize(35231));
    }

    @Test
    public void testDigitize2() throws Exception {

        assertArrayEquals(new int[] {0, 1, 3, 2, 5, 3}, Digitize.digitize(352310));
    }

    @Test
    public void testDigitize3() throws Exception {

        assertArrayEquals(new int[] {0}, Digitize.digitize(0));
    }
}