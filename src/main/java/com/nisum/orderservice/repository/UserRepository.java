package com.nisum.orderservice.repository;

import com.nisum.orderservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
