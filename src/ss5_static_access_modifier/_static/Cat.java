package ss5_static_access_modifier._static;

import ss5_static_access_modifier.access_modifier.Animal;

public class Cat extends Animal {
    public void test() {
        System.out.println(this.weight);
    }
}
