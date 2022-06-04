package lesson14;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("Бананы",2);
        fridge.putProduct("Яблоко",5);
        fridge.putProduct("Груша",3);
        fridge.putProduct("Бананы",4);

        fridge.getProduct("Яблоко", 2);
        fridge.printAllProducts();
    }
}
