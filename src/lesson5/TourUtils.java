package lesson5;

public class TourUtils {
    public static void printToursBuyMoney(String[][] tours, String moneyToTrip) {
        // moneyToTrip - 100000
        // tourCost - 40000 +- 20000

        int moneyFromUser = Integer.parseInt(moneyToTrip);

        for (int i = 0; i < tours.length; i++){
            String tourCostStr = tours[i][1];
          int tourCost = Integer.parseInt(tourCostStr);
          if ((tourCost > (moneyFromUser - 20000)) && (tourCost < (moneyFromUser + 20000))){
              System.out.printf("Тур: %s, %s руб, %s, транспорт - %s, отель - %s \n",
                      tours[i][0],tours[i][1],tours[i][2],tours[i][3],tours[i][4]);

          }
        }
    }
    public static void printAverageCost(String[][] tours){
        int summa = 0;
        for (int i = 0; i < tours.length; i++) {
            String tourCostStr = tours[i][1];
            int tourCost = Integer.parseInt(tourCostStr);
            summa = summa + tourCost;
        }
        System.out.println("Средняя стоимость тура:" + (summa / tours.length) + "руб.");
    }
}
