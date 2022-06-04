package lesson11.blackjack;

public interface IBlackJack {

    void addPlayer(IPlayer player);

    void dealTwoCards();

    void dealAllcards();

    void printWinner();
}
