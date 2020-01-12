package com.nisum.orderservice.service;

import com.nisum.orderservice.model.Item;
import com.nisum.orderservice.model.Order;
import com.nisum.orderservice.model.User;
import com.nisum.orderservice.repository.ItemRepository;
import com.nisum.orderservice.repository.OrderRepository;
import com.nisum.orderservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ItemRepository itemRepository;

    public Double getDiscountPrice(Order order) {
        // validate user id
        Optional<User> user = userRepository.findById(order.getUserId());
        if(user.get()==null) throw new RuntimeException("User not found");
        // validate item id
        Optional<Item> item = itemRepository.findById(order.getItemId());
        if(item.get()==null) throw new RuntimeException("Item not found");
        // based on user type, calculate discount price and return it
        switch ( user.get().getType()){
            case "bronze" : return item.get().getPrice() * 0.05;
            case "silver" : return item.get().getPrice() * 0.1;
            case "gold" : return item.get().getPrice() * 0.2;
        }
        return null;
    }
}
