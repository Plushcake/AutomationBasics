package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remainTest1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int amount = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainTest2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int amount = 500;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainTest3() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    void remainTest4() {
        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int amount = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}