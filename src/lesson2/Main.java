package lesson2;

public class Main {

    public static void main(String[] args) {
        int money = 1010;
        int pizzaCost = 230;
        int bubbleCost = 26;
        double candyCost = 2.5;

        // математические операторы  в java
        // +  -  /  *
        // ++ (увеличение себя на единицу)
        // -- (уменьшение себя на  единицу)
        // % - вычисление остатка от деления 10 % 3 = 1; 12 % 2 = 0; 3 % 2 = 1;

        int canBuyPizza = money / pizzaCost;  // получится целое число!!! (4)
        int restAfterPizzaBuy = money % pizzaCost; // выщитали 80 руб сдачи
        int canBuyBubble = restAfterPizzaBuy / bubbleCost; // 80 / 26 = 3
        int restAfterBubbleBuy = restAfterPizzaBuy % bubbleCost ; // 80 % 26 = 4

        int canBuyCandy = (int)(restAfterBubbleBuy / candyCost); ///   !!!
        double totalRest = restAfterBubbleBuy - (candyCost * canBuyCandy);
        System.out.println("Кол-во пицц:" + canBuyPizza);
        System.out.println("Кол-во жвачек:" + canBuyBubble);
        System.out.println("Кол-во конфет:" + canBuyCandy);
        System.out.println("Остаток:" + totalRest);

        //преобразование типа int ---> double, byte -- > int


    }
}
