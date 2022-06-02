package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0ThenException() {
        new Fact().calc(-1);
    }

    @Test()
    public void whenN3Then6() {
        int actual = new Fact().calc(3);
        int expected = 6;
        assertEquals(expected, actual);
    }
}