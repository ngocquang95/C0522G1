package ss6_inheritence.example1.model;

import java.util.Objects;

public class Dog extends Animal {
    private String color;

    public Dog() {
//        super("ABC");
        System.out.println("Dog()");
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(String name, String color) {
//        super(name);
        this.color = color;
    }

    @Override
    Animal count() {
        return null;
    }

    @Override
    public void bark() {
        System.out.println("Dog barking...");
    }

    @Override
    public String toString() {
        return super.toString() + "Dog{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return color.equals(dog.color) && super.getName().equals(dog.getName());
    }
}