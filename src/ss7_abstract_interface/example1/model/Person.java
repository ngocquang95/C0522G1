package ss7_abstract_interface.example1.model;

public interface Person {
    // public static final => dư thừa
    int MAX = 2;

    // public abstract
    void run();

    default void eat() {
        System.out.println("Person eat()");
    }

    static void drink() {
        System.out.println("Person eat()");
    }
}
