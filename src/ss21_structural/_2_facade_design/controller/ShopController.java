package ss21_structural._2_facade_design.controller;

import ss21_structural._2_facade_design.facade.ShopFacade;

public class ShopController {
    public static void main(String[] args) {
        ShopFacade shopFacade = new ShopFacade();

        shopFacade.pay("tanhuan@gmail.com");
    }
}
