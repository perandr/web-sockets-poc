package com.perandr.websocketspoc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;

@AllArgsConstructor
@Data
public class Order {
    private String orderId;
    private ZonedDateTime createdTime;
}
