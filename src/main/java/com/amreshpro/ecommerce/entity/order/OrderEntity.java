package com.amreshpro.ecommerce.entity.order;

import com.amreshpro.ecommerce.entity.customer.CustomerEntity;
import com.amreshpro.ecommerce.entity.payment.PaymentEntity;
import com.amreshpro.ecommerce.entity.product.ProductEntity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<ProductEntity> products;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private PaymentEntity payment;
}
