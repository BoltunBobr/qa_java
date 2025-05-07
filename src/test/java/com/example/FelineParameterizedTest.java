package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int checkValue;
    private final int expectedValue;

    public FelineParameterizedTest (int checkValue, int expectedValue) {
        this.checkValue = checkValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] testData() {
        return new Object[][] {
                {-1, -1},
                {0, 0},
                {1, 1},
        };
    }

    @Test
    public void getKittensTest() {
        Feline kot = new Feline();
        int actual = kot.getKittens(checkValue);
        assertEquals(expectedValue,actual);
    }
}