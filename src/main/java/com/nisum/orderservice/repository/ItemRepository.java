package com.nisum.orderservice.repository;

import com.nisum.orderservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}

