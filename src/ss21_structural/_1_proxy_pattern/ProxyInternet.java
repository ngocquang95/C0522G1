package ss21_structural._1_proxy_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    static List<String> blacklist = new ArrayList<>();

    private RealInternet realInternet = new RealInternet();
    static {
        blacklist.add("facebook");
        blacklist.add("nauanngon");
        blacklist.add("zalo");
        blacklist.add("muahong");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (blacklist.contains(serverHost)) {
            throw new Exception("Đang trong giờ học, không thể tới " + serverHost);
        }

        realInternet.connectTo(serverHost);
    }
}
