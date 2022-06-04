package lesson11;

public class Main {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Bear bear1 = new Bear();
        Bear bear2 = new Bear();

        AbstractAnimal[] animals = new AbstractAnimal[6];
        animals[0] = elephant1;
        animals[1] = tiger1;
        animals[2] = bear1;
        animals[3] = elephant2;
        animals[4] = tiger2;
        animals[5] =bear2;

        // for each
        for (AbstractAnimal currentAnimal:animals){
            currentAnimal.voice();  // появление полиморфизма
            /** Полиморфизм - это свойство Java, которое проявляется в момент запуска программы
             *  Данное свойство позволяет работать с разными типами данных как с одним и тем же
             *  Но вто  же самое время : реализация программы отрабатывает как будто мы
             *  работаем с разными типами
              */
        }

    }
}
