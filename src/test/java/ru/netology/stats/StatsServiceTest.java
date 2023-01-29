package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void amountSalesYear() {                  //Сумма продаж за год
        StatsService service = new StatsService();
        int[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmount = 180;
        long actualAmount = service.amountSales(salesYear);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageSalesMonthYearTest() {     // Средняя сумма продаж в месяц
        StatsService service = new StatsService();
        int[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 5};
        int expectedAmount = 13;
        int actualAmount = service.averageSaleMonth(salesYear);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void maxSaleMonth() {
        StatsService service = new StatsService();
        long[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSaleMonth = 8;
        int actualMaxSaleMonth = service.maxSaleMonth(salesYear);
        Assertions.assertEquals(expectedMaxSaleMonth, actualMaxSaleMonth);
    }

    @Test
    public void minSaleMonth() {
        StatsService service = new StatsService();
        long[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 7,};
        int expectedMinSaleMonth = 12;
        int actualMinSaleMonth = service.minSaleMonth(salesYear);
        Assertions.assertEquals(expectedMinSaleMonth, actualMinSaleMonth);

    }

    @Test
    public void amountAverageMinSales() {  //количество месяцев с продажами ниже среднего
        StatsService service = new StatsService();
        int[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 5, 5};
        int expectedAverageMinSales = 4;
        int actualAverageMinSales = service.amountAverageMinSales(salesYear);
        Assertions.assertEquals(expectedAverageMinSales, actualAverageMinSales);

    }

    @Test
    public void amountAverageMaxSalesTest() {
        StatsService service = new StatsService(); //Количество месяцев с продажами выше среднего
        int[] salesYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 5};
        int expectedAverageMaxSales = 8;
        int actualAverageMaxSales = service.amountAverageMaxSales(salesYear);
        Assertions.assertEquals(expectedAverageMaxSales, actualAverageMaxSales);
    }


}




