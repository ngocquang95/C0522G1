package ss20_design_pattern._1_singleton_pattern;

public class Service {
    private Service() {
        System.out.println("Constructor Service được gọi");
    }

    //Cách 1 - Eager
//    private static Service service = new Service();
//
//    public static Service getInstance() {
//        return service;
//    }

    //Cách 2 - Lazy
    private static Service service;

    public static synchronized Service getInstance() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }


    public static void test() {

    }

}
