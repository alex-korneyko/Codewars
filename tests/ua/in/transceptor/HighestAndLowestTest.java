package ua.in.transceptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Korneyko on 10.05.2016.
 */
public class HighestAndLowestTest {

    @Test
    public void testHighAndLow1() throws Exception {
        assertEquals("42 -9", HighestAndLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void testHighAndLow2() throws Exception {
        assertEquals("2147483647 -2147483648", HighestAndLowest.HighAndLow("8 2147483647 -5 42 -2147483648 0 0 -9 4 7 4 -4"));
    }
}