package ss21_structural._1_proxy_pattern;

public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Bạn đang ở " + serverHost);
    }
}
