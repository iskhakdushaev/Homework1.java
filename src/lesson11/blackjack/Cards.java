package lesson11.blackjack;

public class Cards implements ICard{
    private String name;
    private int value;

    public Cards() {
    }

    public Cards(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void open() {
        System.out.println(name);
    }
}
