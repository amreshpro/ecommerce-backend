package com.amreshpro.ecommerce.repository.order;

import org.springframework.stereotype.Repository;@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}