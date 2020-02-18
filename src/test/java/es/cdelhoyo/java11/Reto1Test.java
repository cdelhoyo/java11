package es.cdelhoyo.java11;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Reto1Test {

    @Test
    public void test() {
        assertEquals(2, Reto1.calcula(45));
        assertEquals(2, Reto1.calcula(1564));
        assertEquals(0, Reto1.calcula(7));
        assertEquals(4, Reto1.calcula(777));
        assertEquals(2, Reto1.calcula(1234));
        assertEquals(2, Reto1.calcula(78654));
    }
}
