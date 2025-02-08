package com.amreshpro.ecommerce.entity.cart;


import com.amreshpro.ecommerce.entity.customer.CustomerEntity;
import com.amreshpro.ecommerce.entity.product.ProductEntity;import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private List<ProductEntity> products;
}
