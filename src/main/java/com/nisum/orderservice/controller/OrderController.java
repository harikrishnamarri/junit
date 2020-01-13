package com.nisum.orderservice.controller;

import com.nisum.orderservice.model.Order;
import com.nisum.orderservice.service.OrderService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    Logger logger= LogManager.getLogger(OrderController.class);
    @Autowired
    private OrderService orderService;

    @PostMapping("order")
    public ResponseEntity getDiscountPrice(@RequestBody Order order){
        logger.info("getDiscountPrice Started");
        Double price = orderService.getDiscountPrice(order);
        logger.info("getDiscountPrice Ended");
        return ResponseEntity.ok().body(price);

    }

    @GetMapping("order")
    public ResponseEntity getDiscountPrice2(){
        logger.info("getDiscountPrice2 Started");
        Order order = new Order();
        order.setUserId(1L);
        order.setItemId(1L);
        return ResponseEntity.ok().body(order);
    }
}
