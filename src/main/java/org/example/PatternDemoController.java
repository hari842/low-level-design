package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import patterns.decorator.AlmondMilk;
import patterns.decorator.Beverage;
import patterns.decorator.Espresso;
import patterns.decorator.GoatMilk;
import patterns.decorator.Milk;
import patterns.observer.EmailNotification;
import patterns.observer.OrderService;
import patterns.observer.ProductOrder;
import patterns.observer.SmsNotification;
import patterns.observer.WhatsappNotification;
import patterns.strategy.AbstractApplications;
import patterns.strategy.CardPayment;
import patterns.strategy.Phonepe;

@RestController
@RequestMapping("/demo")
public class PatternDemoController {
    @GetMapping("/strategy")
    public String strategy() {
        AbstractApplications phonepe = new Phonepe();
        phonepe.setPayment(new CardPayment());
        return "PhonePe switched at runtime to CardPayment";
    }

    @GetMapping("/decorator")
    public String decorator() {
        Beverage beverage = new Milk(new Espresso());
        beverage = new AlmondMilk(beverage);
        beverage = new GoatMilk(beverage);
        return beverage.getDescription() + ", Cost : " + beverage.cost();
    }

    @GetMapping("/observer")
    public String observer() {
        OrderService orderService = new OrderService();
        orderService.registerObservers(new EmailNotification());
        orderService.registerObservers(new SmsNotification());
        orderService.registerObservers(new WhatsappNotification());
        orderService.updateOrderStatus("SHIPPING");

        ProductOrder productOrder = new ProductOrder();
        productOrder.registerObservers(new WhatsappNotification());
        productOrder.updateOrderStatus("APPROVED");

        return "Observer demo completed";
    }
}
