package com.amreshpro.ecommerce.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "order")
    private Set<ProductEntity> products;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "status", nullable = false)
    private String status; // e.g., "PENDING", "SHIPPED", "DELIVERED"

    @OneToOne(mappedBy = "order")
    private PaymentEntity payment;

    // Getters and Setters
}
