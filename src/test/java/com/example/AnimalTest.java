package com.example;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AnimalTest {
private  Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void getFoodExceptionTest() throws Exception {
        exceptionRule.expect(java.lang.Exception.class);
        exceptionRule.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        animal.getFood("Падальщики");
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

}