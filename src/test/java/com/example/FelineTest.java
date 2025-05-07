package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    private Feline kot;

    @Before
    public void setUp() {
        kot = new Feline();
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> eatList = kot.eatMeat();
        assertEquals(List.of("Животные","Птицы","Рыба"), eatList);
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", kot.getFamily());
    }

    @Test
    public void getKittensTest() {
        assertEquals(1, kot.getKittens());
    }

    @Test
    public void getKittensCountTest() {
        assertEquals(10, kot.getKittens(10));
    }

}