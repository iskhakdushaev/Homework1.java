package lesson11.blackjack;

import java.util.concurrent.ThreadLocalRandom;

public class Coloda implements IColoda{
    private ICard[] cards = new ICard[52];

    public Coloda() {
        cards[0] = new Cards("Двойка трефа",2);
        cards[1] = new Cards("Двойка бубна",2);
        cards[2] = new Cards("Двойка черви",2);
        cards[3] = new Cards("Двойка пика",2);

        cards[4] = new Cards("Тройка трефа",3);
        cards[5] = new Cards("Тройка бубна",3);
        cards[6] = new Cards("Тройка черви",3);
        cards[7] = new Cards("Тройка пика",3);

        cards[8] = new Cards("Четверка трефа",4);
        cards[9] = new Cards("Четверка бубна",4);
        cards[10] = new Cards("Четверка черви",4);
        cards[11] = new Cards("Четверка пика",4);

        cards[12] = new Cards("Пять трефа",5);
        cards[13] = new Cards("Пять бубна",5);
        cards[14] = new Cards("Пять черви",5);
        cards[15] = new Cards("Пять пика",5);

        cards[16] = new Cards("Шесть трефа",6);
        cards[17] = new Cards("Шесть бубна",6);
        cards[18] = new Cards("Шесть черви",6);
        cards[19] = new Cards("Шесть пика",6);

        cards[20] = new Cards("Семь трефа",7);
        cards[21] = new Cards("Семь бубна",7);
        cards[22] = new Cards("Семь черви",7);
        cards[23] = new Cards("Семь пика",7);

        cards[24] = new Cards("Восемь трефа",8);
        cards[25] = new Cards("Восемь бубна",8);
        cards[26] = new Cards("Восемь черви",8);
        cards[27] = new Cards("Восемь пика",8);

        cards[28] = new Cards("Девять трефа",9);
        cards[29] = new Cards("Девять бубна",9);
        cards[30] = new Cards("Девять черви",9);
        cards[31] = new Cards("Девять пика",9);

        cards[32] = new Cards("Десять трефа",10);
        cards[33] = new Cards("Десять бубна",10);
        cards[34] = new Cards("Десять черви",10);
        cards[35] = new Cards("Десять пика",10);

        cards[36] = new Cards("Валет трефа",11);
        cards[37] = new Cards("Валет бубна",11);
        cards[38] = new Cards("Валет черви",11);
        cards[39] = new Cards("Валет пика",11);

        cards[40] = new Cards("Дама трефа",12);
        cards[41] = new Cards("Дама бубна",12);
        cards[42] = new Cards("Дама черви",12);
        cards[43] = new Cards("Дама пика",12);

        cards[44] = new Cards("Король трефа",13);
        cards[45] = new Cards("Король бубна",13);
        cards[46] = new Cards("Король черви",13);
        cards[47] = new Cards("Король пика",13);

        cards[48] = new Cards("Туз трефа",14);
        cards[49] = new Cards("Туз бубна",14);
        cards[50] = new Cards("Туз черви",14);
        cards[51] = new Cards("Туз пика",14);
    }

    @Override
    public ICard getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 52);
        return cards[randomNum];
    }
}
