package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void adding2and3equals5() {
        assertEquals(5, Main.add(2, 3));
    }

    @Test
    void threeIsNotEven() {
        assertFalse(Main.isEven(3));
    }

    @Test
    void threeTimesFiveEqualsFifteen() {
        assertEquals(15, Main.mult(3, 5));
    }

    @Test
    void converts_TeEsTiNg_to_TESTING() {
        String testcase = "TesTiNg";
        assertEquals("TESTING", Main.upperCase(testcase));
    }

    @Test
    void negativeOneIsNotPositive() {
        assertFalse(Main.isPositive(-1));
    }
}