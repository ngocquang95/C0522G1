package ss14_sort.model;


import java.util.Objects;

public class Student extends Person implements Comparable<Student> {

    private String nameClass;
    private double point;

    public String getNameClass() {
        return this.nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }


    public Student(String nameClass, double point) {
        this.nameClass = nameClass;
        this.point = point;
    }

    public Student(String name, int age, String nameClass, double point) {
        super(name, age);
        this.nameClass = nameClass;
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameClass='" + nameClass + '\'' +
                ", point=" + point +
                "} " + super.toString();
    }

    public Student() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.point, point) == 0 &&
                nameClass.equals(student.nameClass) && this.getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameClass, point);
    }

    @Override
    public int compareTo(Student o) {
        //Tìm kiếm theo tên nên sắp xếp theo tên.
        double result = this.point - o.getPoint();
        if (result > 0) {
            return 1;
        } else if (result < 0) {
            return -1;
        } else {
            return 0;
        }
//        return this.getName().compareTo(o.getName());
    }
}
