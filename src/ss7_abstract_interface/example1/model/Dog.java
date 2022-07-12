package ss7_abstract_interface.example1.model;

public abstract class Dog extends Animal {
    private boolean isMale;
    @Override
    public void run() {
        System.out.println("Dog run");
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
