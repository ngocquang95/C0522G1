package ss7_abstract_interface.example1.model;

public abstract class Animal {
    private int id; // interface => thuộc tính public static final
    private String name;

    public abstract void run();

    public void eat() {
        System.out.println("Animal eat");
    }
}
