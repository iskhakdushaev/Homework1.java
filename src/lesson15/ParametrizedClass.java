package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {
    public static void main(String[] args) {
        Example<Double> stringExample = new Example<>();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("Hi");
        stringExample.printElementCollections(strings);
    }
}

class Example<T extends Number> {
    T value;

    public void showValue() {
        System.out.println(value);
    }
    public <V> void printElementCollections(List<V> values) {
        for (V v : values) {
            System.out.println(v);
        }
    }

//    public <R, L> R mapper(L from, R to){
//    }
}