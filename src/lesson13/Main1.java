package lesson13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1800, 5, 2.5, "Золото");
        Coin coin2 = new Coin(1800, 5, 2.5, "Золото");
        Coin coin3 = new Coin(1840, 20, 6, "Серебро");
        Coin coin4 = new Coin(1820, 10, 9, "Платинум");
        Coin coin5 = new Coin(1900, 1, 3.8, "Алмаз");

       // HashSet<Coin> coins = new HashSet<>();
      //  LinkedHashSet<Coin> coins = new LinkedHashSet<>();
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

//        for (Coin coin: coins){
//            System.out.println(coin);
//        }
        CoinSort.printCoinByMetall(coins);
        CoinSort.printCoinByNominal(coins);
    }
}
