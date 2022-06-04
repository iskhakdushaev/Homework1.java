package lesson7;

public class Main1 {
    public static void main(String[] args) {


        Student student1 = new Student(14, "Вася" , "Пупкин");
        Student student2 = new Student(18, "Саша" ,"Цыбин");

        student1.setAge(14);
        student2.setAge(18);

        System.out.println(student1.getAge());
        System.out.println(student2.getAge());

    }
}
