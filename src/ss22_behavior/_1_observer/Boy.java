package ss22_behavior._1_observer;

public class Boy extends Address implements Observer {
    private String name;
    private Address address; // has-A

    public Boy(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + " Đã update trạng thái của anh ấy");
    }
}
