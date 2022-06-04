package lesson15;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 4);
        Student student4 = new Student(4, "Ivan", 1);

        Student student1 = new Student(2, "Elena", 2);
        Student student2 = new Student(3, "Inna", 1);
        Student student3 = new Student(4, "Peter", 5);
        TreeMap<Student, Integer> treeMap = new TreeMap<>();

        treeMap.put(student, 4);
        treeMap.put(student4, 6);
        treeMap.put(student1, 4);
        treeMap.put(student3, 21);

        System.out.println(treeMap);

    }
}
