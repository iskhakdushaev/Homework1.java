package lesson15;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Student student = new Student(1, "Ivan", 4);
        Student student4 = new Student(4, "Ivan", 1);

        Student student1 = new Student(2, "Elena", 2);
        Student student2 = new Student(3, "Inna", 1);
        Student student3 = new Student(4, "Peter", 5);

        // Map<Student, Double> studentMap = new HashMap<>(32, 100);
        Map<String, Student> studentMap = new HashMap<>();
        //  studentMap.put(student, 7.9);
        // studentMap.putIfAbsent(student4, 6.7);

        studentMap.put("Биология", student);

//        studentMap.get(student4);
//        System.out.println(studentMap);
    }
}

