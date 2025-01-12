package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "test_tb")
@Getter
@NoArgsConstructor
public class TestEntity {
    
    @Id
    private String test_id;
    
    private Long age;
    private String address;
} 