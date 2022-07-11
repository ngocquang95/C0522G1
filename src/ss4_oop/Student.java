package ss4_oop;

public class Student {
    String name;
    int age;
    String color;

    public Student() {
        name = "";
        color = "";
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this("Ngọc Quang", 18, "red");
        name = name; // câu lệnh vô nghĩa
    }

    public Student(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
