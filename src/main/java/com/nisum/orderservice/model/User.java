package com.nisum.orderservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String type;
}
