package ss19_solid._3_liskov_substitution.correct;

public abstract class AnimalWithAddress extends Animal {
    private Address address;

    public abstract void getInfoAddress();
}
