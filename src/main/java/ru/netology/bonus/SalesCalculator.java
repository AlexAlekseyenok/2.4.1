package ru.netology.bonus;

public class SalesCalculator {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {;
        sum += purchase;
    }
        return sum;
}

    public long averageNum(long[] purchases) {
        long calculateSum = calculateSum(purchases);
        return calculateSum / purchases.length;
    }

    public long findMax(long[] purchases) {
        long maxCurrent = purchases[0];
        long maxNum = 0;
        for (long i = 0; i < purchases.length; i++) {
            if (maxCurrent >= i) {
                maxNum = i;
            }
        }
        return maxNum;
    }

    public long findMin(long[] purchases) {
        long maxCurrent = purchases[0];
        long minNum = 0;
        for (long i = 0; i > purchases.length; i++) {
            if (maxCurrent <= i) {
                minNum = i;
            }
        }
        return minNum + 1;
    }

    public long findNumBelowAverage (long[] purchases) {
        long averageNum = averageNum(purchases);
        long numBelowAverage = 0;
        for (int i = 0; i < purchases.length; i++){
            if (purchases[i] < averageNum){
                numBelowAverage += 1;
            }
        }
        return numBelowAverage;
    }

    public long findNumAboveAverage (long[] purchases) {
        long averageNum = averageNum(purchases);
        long numAboveAverage = 0;
        for (int i = 0; i < purchases.length; i++){
            if (purchases[i] > averageNum){
                numAboveAverage += 1;
            }
        }
        return numAboveAverage;
    }
}
