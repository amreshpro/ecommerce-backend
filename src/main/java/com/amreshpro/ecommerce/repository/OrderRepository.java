package com.amreshpro.ecommerce.repository;

import com.amreshpro.ecommerce.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity,String> {
}