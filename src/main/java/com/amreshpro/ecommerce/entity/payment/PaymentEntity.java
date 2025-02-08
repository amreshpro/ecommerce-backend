package com.amreshpro.ecommerce.entity.payment;




import com.amreshpro.ecommerce.entity.order.OrderEntity;
import jakarta.persistence.*;


@Entity
@Table(name = "payments")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String paymentMethod;
    private boolean status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
