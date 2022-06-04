package lesson15;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        if (course != student.course) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + course;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.compareTo(o.name) == 1) {
            return this.name.compareTo(o.name);
        }else if (this.name.compareTo(o.name) == 0);
        return this.course - o.course;

    }
}

