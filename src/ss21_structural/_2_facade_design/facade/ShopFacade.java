package ss21_structural._2_facade_design.facade;

import ss21_structural._2_facade_design.service.EmailService;
import ss21_structural._2_facade_design.service.PaymentService;
import ss21_structural._2_facade_design.service.ShippingService;

public class ShopFacade {
//    ShopFacade shopFacade;

    private EmailService emailService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public ShopFacade() {
        this.emailService = new EmailService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void pay(String email) {
        emailService.sendEmail(email);
        paymentService.pay();
        shippingService.ship();
    }

}
