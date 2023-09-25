package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    public void testSum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverage() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaximum() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maximumMonth(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMin() {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonth(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBellowAverage1 () {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBellowAverage1(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testBellowAverage2 () {
        ru.netology.stats.StatsService service = new ru.netology.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBellowAverage2(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}