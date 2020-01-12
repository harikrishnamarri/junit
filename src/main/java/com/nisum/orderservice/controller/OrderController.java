package com.nisum.orderservice.controller;

import com.nisum.orderservice.model.Order;
import com.nisum.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("order")
    public ResponseEntity getDiscountPrice(@RequestBody Order order){
        Double price = orderService.getDiscountPrice(order);
        return ResponseEntity.ok().body(price);
    }

    @GetMapping("order")
    public ResponseEntity getDiscountPrice2(){
        Order order = new Order();
        order.setUserId(1L);
        order.setItemId(1L);
        return ResponseEntity.ok().body(order);
    }
}
