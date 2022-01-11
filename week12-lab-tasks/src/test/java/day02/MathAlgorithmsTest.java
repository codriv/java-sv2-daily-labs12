package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testMathAlgorithms() {
        assertEquals(6, MathAlgorithms.divisor(12, 18));
        assertEquals(12, MathAlgorithms.divisor(48, 36));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> MathAlgorithms.divisor(0, 15));
        assertEquals("Number can not be 0!", iae.getMessage());

        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                ()-> MathAlgorithms.divisor(24, 0));
        assertEquals("Number can not be 0!", iae.getMessage());
    }

}