package ru.netology.bonus;

import org.junit.jupiter.api.Test;
import ru.netology.bonus.SalesCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculatorTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void CalculateSum() {
        SalesCalculator service = new SalesCalculator();

        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);


    }

    @Test
    void middleNum() {
        SalesCalculator service = new SalesCalculator();

        long expected = 15;

        long actual = service.averageNum(purchases);

        assertEquals(expected, actual);


    }

    @Test
    void findMax() {
        SalesCalculator service = new SalesCalculator();

        long expected = 8;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);


    }

    @Test
    void findMin() {
        SalesCalculator service = new SalesCalculator();

        long expected = 1;

        long actual = service.findMin(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void findNumBelowAverage() {
        SalesCalculator service = new SalesCalculator();

        long expected = 5;

        long actual = service.findNumBelowAverage(purchases);

        assertEquals(expected, actual);

    }

    @Test
    void findNumAboveAverage() {
        SalesCalculator service = new SalesCalculator();

        long expected = 5;

        long actual = service.findNumAboveAverage(purchases);

        assertEquals(expected, actual);

    }
}