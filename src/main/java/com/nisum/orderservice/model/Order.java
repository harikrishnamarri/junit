package com.nisum.orderservice.model;

import lombok.*;

import javax.persistence.*;

@Data
public class Order {
    private Long itemId;
    private Long userId;
}
