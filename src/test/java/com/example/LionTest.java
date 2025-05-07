package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Male", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> listFoodExpected = List.of("Животные","Птицы","Рыба");
        when(feline.getFood("Хищник")).thenReturn(listFoodExpected);
        List<String> listFoodActual = lion.getFood();
        assertEquals(listFoodExpected, listFoodActual);
    }

}