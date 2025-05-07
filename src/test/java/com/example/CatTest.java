package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> listFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(listFood);
        List<String> listFoodCat = cat.getFood();
        assertEquals(listFoodCat, listFood);
    }

    @Test
    public void getFoodVerifyTest() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}