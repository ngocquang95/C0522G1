package ss19_solid._5_dependency_inversion.wrong;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyễn Tấn Huân", 3, new LaptopDell());
//        Student student2 = new Student(1, "Nguyễn Tấn Huân", 3, new LaptopMacbook());
    }
}
