package ss20_design_pattern._1_singleton_pattern;

public class Controller {
    public static void test() {
//        Service service = new Service();
        Service service = Service.getInstance();
    }
}
