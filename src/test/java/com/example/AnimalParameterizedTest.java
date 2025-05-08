package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String checkValue;
    private final List<String> expectedValue;

    public AnimalParameterizedTest(String checkValue, List<String> expectedValue) {
        this.checkValue = checkValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[][] testData() {
        return  new Object[][]{
        {"Травоядное", List.of("Трава", "Различные растения")},
        {"Хищник", List.of("Животные", "Птицы", "Рыба")},
    };
}


    @Test
    public void getFoodTest() throws Exception {
    Animal animal = new Animal();
    List<String> actual = animal.getFood(checkValue);
    assertEquals(expectedValue,actual);
    }
}