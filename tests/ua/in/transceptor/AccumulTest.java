package ua.in.transceptor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Alex Korneyko on 11.05.2016.
 */
public class AccumulTest {


    @Test(timeout = 1000)
    public void testAccum() throws Exception {

        assertEquals("A-Bb-Ccc-Dddd", Accumul.accum("abcd"));
        assertEquals("N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb", Accumul.accum("NyffsGeyylB"));
    }
}