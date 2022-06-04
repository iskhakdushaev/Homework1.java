package lesson9;

public class TestTort {
    public static void main(String[] args) {
        Baking baking = new Tort();
        baking.about();


        baking = new Cream(baking);
        baking.about();

         baking = new Chocolate(baking);
        baking.about();
    }
}
