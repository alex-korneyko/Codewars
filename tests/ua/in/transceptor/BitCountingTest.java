package ua.in.transceptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Korneyko on 01.07.2016.
 */
public class BitCountingTest {

    @Test
    public void testGame() {
        assertEquals(5, BitCounting.countBits(1234));
        assertEquals(1, BitCounting.countBits(4));
        assertEquals(3, BitCounting.countBits(7));
        assertEquals(2, BitCounting.countBits(9));
        assertEquals(2, BitCounting.countBits(10));
    }
}