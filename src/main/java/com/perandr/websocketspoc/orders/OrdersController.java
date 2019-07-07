package com.perandr.websocketspoc.orders;

import com.perandr.websocketspoc.dto.Order;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class OrdersController {

    @MessageMapping("/orders")
    @SendTo("/topic/orders")
    public Order getOrders(OrderRequest orderRequest) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Order(UUID.randomUUID().toString());
    }
}
