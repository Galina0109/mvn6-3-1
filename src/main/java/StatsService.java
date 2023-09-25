package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maximumMonth(long[] sales) {
        int MonthMaximumSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MonthMaximumSale]) {
                MonthMaximumSale = i;
            }
        }
        return MonthMaximumSale + 1;
    }

    public int minMonth(long[] sales) {
        int MonthMinSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[MonthMinSale]) {
                MonthMinSale = i;
            }
        }
        return MonthMinSale + 1;
    }

    public int monthBellowAverage1(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthBellowAverage2(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}