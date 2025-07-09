package com.gitapp.gitdemo.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)

public class CalculatorTest {
    @InjectMocks
    private Calculator calculator;

    @Test
    void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sumar(2, 3));
    }
}





