package ss22_behavior._1_observer;

public class Client {
    public static void main(String[] args) {
        HotGirl hotGirl = new HotGirl();
        hotGirl.add(new Boy("Huân"));
        hotGirl.add(new Boy("Huy"));
        hotGirl.add(new Boy("Học"));
        hotGirl.add(new Boy("Tý"));

        hotGirl.postToFacebook();
    }
}
