package com.amreshpro.ecommerce.dto.cart;


import com.amreshpro.ecommerce.dto.product.ProductDTO;
import java.util.List;


public class CartDTO {
    private Long id;
    private Long customerId;
    private List<ProductDTO> products;
}
