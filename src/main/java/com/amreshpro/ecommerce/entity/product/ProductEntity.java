package com.amreshpro.ecommerce.entity.product;


import com.amreshpro.ecommerce.entity.category.CategoryEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
