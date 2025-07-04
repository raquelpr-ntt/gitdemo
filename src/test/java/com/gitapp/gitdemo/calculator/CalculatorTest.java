package com.gitapp.gitdemo.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

 @Test
        void testSum() {
            Calculator calculator = new Calculator();
            assertEquals(5, calculator.sumar(2, 3));
        }
    }





