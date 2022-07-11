package ss6_inheritence.example1.controller;


import ss6_inheritence.example1.model.Animal;
import ss6_inheritence.example1.model.Dog;

public class MainController {
    static final int MAX = 2;
    public static void main(String[] args) {
//        Dog dog = new Dog("anni", "red");
//        Dog dog2 = new Dog("anni", "red");
//        System.out.println(dog.equals(dog2)); // true
//
//        dog.bark();
//        dog.eat();

        Animal animal = new Animal(); // ngầm định
        Dog dog = (Dog) animal; // Tường minh
    }
}
