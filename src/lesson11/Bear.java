package lesson11;

public class Bear extends AbstractAnimal{
    @Override
    public void printHaveKhvost() {
        System.out.println("Нет хвоста!");
    }

    @Override
    public void voice() {
        System.out.println("Аааа аааа");
    }
}
