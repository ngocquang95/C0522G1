package ss7_abstract_interface.example1.model;

public class BabyDog extends Dog{
    // KHi nào đến class => tất cả các phương thức abstract phải override lại ít nhất một lần
    @Override
    public void run() {
        System.out.println("BabyDog run()");
    }
}
