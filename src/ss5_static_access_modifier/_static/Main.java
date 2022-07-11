package ss5_static_access_modifier._static;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyễn Tấn Huân");

        student.setName("Nguyễn Văn A");
        System.out.println("Name " + student.getName());

        student.setScore(100);

        System.out.println("Score: " + student.getScore());
    }
}
