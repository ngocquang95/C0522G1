package ontap_final.model;

public abstract class Person {
    public abstract String getInfo();

    public static void main(String[] args) {
        String name = "Nguyễn Ngọc Quang";
        String[] info = name.split(" ");
        System.out.println(info[info.length - 1]);
    }
}
