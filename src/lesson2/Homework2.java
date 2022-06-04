package lesson2;

public class Homework2 {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if (i <= 30 || i >= 35) {
                System.out.println(i);

            }

        }
        System.out.println("Задание номер 1");

        for (int i = 0; i >= -20; i--) {
            System.out.println(i);
        }
        System.out.println("Задание номер 2");

        for (int i = -100; i >= -150; i = i - 2) {
            System.out.println(i);

        }
        System.out.println("Задание номер 3");
        int summa = 0;
        for (int i = 30; i <= 50; i = i + 2) {
            summa = summa + i;
            System.out.println(summa);
        }

        System.out.println("Задание номер 4");

        for (int i = 1; i <= 11; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("Задание номер 5");
    }
}
