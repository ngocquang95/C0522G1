package ss5_static_access_modifier.access_modifier;

public class Animal {
    private String name;
    String color;
    protected double weight;
    public int age;

    private void eat() {
        this.name = "abc";
        this.color = "red";
        this.weight = 132;
        this.age = 12;
        System.out.println("Con mèo ăn cơm!!!");
    }
}