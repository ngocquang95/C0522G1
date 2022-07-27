package ss19_solid._3_liskov_substitution.wrong;

public abstract class Animal {
    private int id;
    private String name;
    private Address address;

    public abstract void getInfoAddress();

    public Animal() {
    }

    public Animal(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
