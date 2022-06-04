package lesson4;

public class Main3 {
    public static void main(String[] args) {
        int [][] chess = new int [8][8];

        // вывести вторую диагональ (без первой) единичками homework

        for (int i = 0; i < chess.length; i++){
            for (int j = 0; j < chess[i].length; j++){
                // if (i != j) то единицы
               if ((i + j) % 2 == 0){
                   System.out.print(chess[i][j] + " ");
               }else {
                   System.out.print("1" + " ");
               }

            }
            System.out.println();

        }
    }
}
