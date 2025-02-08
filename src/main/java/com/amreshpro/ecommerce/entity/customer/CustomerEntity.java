package com.amreshpro.ecommerce.entity.customer;

import com.amreshpro.ecommerce.entity.order.OrderEntity;import jakarta.persistence.*;import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<OrderEntity> orders;
}
