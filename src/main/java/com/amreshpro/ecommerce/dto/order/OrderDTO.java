package com.amreshpro.ecommerce.dto.order;

import com.amreshpro.ecommerce.dto.payment.PaymentDTO;
import com.amreshpro.ecommerce.dto.product.ProductDTO;
import java.time.LocalDateTime;
import java.util.List;

public class OrderDTO {
    private Long id;
    private Long customerId;
    private LocalDateTime orderDate;
    private List<ProductDTO> products;
    private PaymentDTO payment;
}
