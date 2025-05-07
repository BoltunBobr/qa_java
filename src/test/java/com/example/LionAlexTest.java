package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class LionAlexTest {

    private LionAlex lionAlex;

    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getKittensTest() {
        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getFriendsTest() {
        List<String> listFriendsExpected = List.of("Марти","Глория","Мелман");
        List<String> listFriendsActual = lionAlex.getFriends();
        assertEquals(listFriendsExpected, listFriendsActual);
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}