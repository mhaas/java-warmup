package org.computerlinguist.fizzbuzz;

import static org.computerlinguist.fizzbuzz.FizzBuzz.fizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testFizzBuzz() {
        assertEquals(fizzBuzz(-1), "-1");
        assertEquals(fizzBuzz(0), "0");
        assertEquals(fizzBuzz(1), "1");
        assertEquals(fizzBuzz(3), "fizz");
        assertEquals(fizzBuzz(-3), "fizz");
        assertEquals(fizzBuzz(5), "buzz");
        assertEquals(fizzBuzz(-5), "buzz");
        assertEquals(fizzBuzz(15), "fizzbuzz");
    }
}