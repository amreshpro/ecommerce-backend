package com.amreshpro.ecommerce.repository.payment;


import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
