package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void testErrorRemain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1100;
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}