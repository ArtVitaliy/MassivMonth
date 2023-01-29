package ru.netology.stats;

public class StatsService {
    public int amountSales(int[] salesYears) {
        //amountSales сумма продаж за 12 месяцев
        //salesYears продажи
        int amountSales = 0;
        for (int i = 0; i < salesYears.length; i++) {
            amountSales = amountSales + salesYears[i];

        }
        return amountSales;
    }

    public int averageSaleMonth(int[] salesYears) {      //Средняя сумма продаж в месяц

        int averageSale = (amountSales(salesYears)) / salesYears.length;

        return averageSale;
    }

    public int maxSaleMonth(long[] salesYears) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : salesYears) {
            if (sale >= salesYears[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

//        for (int i = 0; i < salesYears.length; i++) {
//            if (salesYears[i] >= salesYears[maxMonth]) {
//                maxMonth = i;
//            }
//        }
//        return maxMonth;

    public int minSaleMonth(long[] salesYears) {
        int minMonth = 0;
        for (int i = 0; i < salesYears.length; i++) {
            if (salesYears[i] <= salesYears[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int amountAverageMinSales(int[] salesYears) {
        int count = 0;
        for (long sale : salesYears) {
            if (sale < averageSaleMonth(salesYears)) {
                count = count + 1;
            }
        }
        return count;
    }

    public int amountAverageMaxSales(int[] salesYears) {
        int count = 0;
        for (long sale : salesYears) {
            if (sale > averageSaleMonth(salesYears)) {
                count = count + 1;
            }
        }
        return count;
    }

}


