package ss7_abstract_interface.example1.model;

public class Student implements Person{
    @Override
    public void run() {
        System.out.println("Student run()");
    }

    @Override
    public void eat() {
        System.out.println("Student eat()");
    }

//    @Override => Lỗi
//    public void drink() {
//        System.out.println("Student eat()");
//    }
}
