package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String checkValue;
    private final boolean expectedValue;

    public LionParameterizedTest (String checkValue, boolean expectedValue){
        this.checkValue = checkValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] testData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline kot = new Feline();
        Lion lion = new Lion(checkValue, kot);
        assertEquals(expectedValue, lion.doesHaveMane());
    }

}