package com.perandr.websocketspoc.orders;

import com.perandr.websocketspoc.dto.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.UUID;

@Slf4j
@RestController
public class OrdersController {

    @MessageMapping("/orders")
    @SendTo("/topic/orders")
    public Order getOrders(OrderRequest orderRequest) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Order(UUID.randomUUID().toString(), ZonedDateTime.now());
    }

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    @SendTo("/topic/orders")
    public void reportCurrentTime() {
        String date = dateFormat.format(new Date());
        log.info("The time is now {}", date);
        new Order(date, ZonedDateTime.now() );
    }

}
