package lesson11;

public class Tiger extends AbstractAnimal{
    @Override
    public void printHaveKhvost() {
        System.out.println("Хвост есть!");
    }

    @Override
    public void voice() {
        System.out.println("Ррррр  ррррр");
    }
}
