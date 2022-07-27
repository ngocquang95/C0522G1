package ss19_solid._3_liskov_substitution.correct;

public abstract class Animal {
    private int id;
    private String name;

    public Animal() {
    }

    public Animal(int id, String name, Address address) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
