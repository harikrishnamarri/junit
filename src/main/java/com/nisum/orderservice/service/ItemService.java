package com.nisum.orderservice.service;

import com.nisum.orderservice.model.Item;
import com.nisum.orderservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item getItemById(Long id) {
        Optional s = itemRepository.findById(id);
        return (Item) s.get();
    }
}
