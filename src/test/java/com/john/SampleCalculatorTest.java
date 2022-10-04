package com.john;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualsFour(){
        SampleCalculator calculator = new SampleCalculator();
        assertEquals(4, calculator.sum(2,2));
    }
}