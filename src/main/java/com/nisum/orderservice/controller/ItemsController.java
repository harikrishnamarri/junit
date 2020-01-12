package com.nisum.orderservice.controller;

import com.nisum.orderservice.model.Item;
import com.nisum.orderservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class ItemsController {
    Logger logger = LogManager.getLogger(ItemsController.class);
    @Autowired
    private ItemService itemService;

    @GetMapping("item/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") Long id){
        logger.info("getItemById : item-id "+id);
        Item item = itemService.getItemById(id);
        return ResponseEntity.ok().body(item);
    }

}
