package ss21_structural._1_proxy_pattern;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("facebook");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
