package lesson3;

public class Homework3 {
    public static void main(String[] args) {
        // Вывести на консоль сумму всех чисел
//        int[] numbers = {2, 4, 45, 3, 64, 3, 5};
//        int summa = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            summa += numbers[i];
//
//        }
//        System.out.println(summa);

        // вывести на консоль массив в обратном порядке

//        int [] numbers = {2, 4, 45, 3, 64, 3, 5};
//
//        for (int i = numbers.length -1; i >= 0 ; i --){
//
//            System.out.println(numbers[i]);
//        }

        // вывести на консоль через одну ячейку сначала

//        int [] numbers = {2, 4, 45, 3, 64, 3, 5};
//        for (int i = 0; i < numbers.length; i + 2){
//            System.out.println(numbers[i]);
//        }

        // вывести на консоль через одну ячейку

        int [] numbers = {2, 4, 45, 3, 64, 3, 5};
        int sumplus = 0;
        for (int i = 1;i < numbers.length - 1; i ++){
            if ((numbers[i - 1] + numbers[i + 1]) % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }

    }
}
