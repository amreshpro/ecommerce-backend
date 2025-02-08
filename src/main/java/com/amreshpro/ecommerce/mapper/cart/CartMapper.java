package com.amreshpro.ecommerce.mapper.cart;

import com.amreshpro.ecommerce.dto.cart.CartDTO;
import com.amreshpro.ecommerce.entity.cart.CartEntity;
import org.springframework.stereotype.Component;
 import org.modelmapper.ModelMapper;
@Component
public  class CartMapper {
private  final  ModelMapper modelMapper = new ModelMapper();
public CartEntity toEntity(CartDTO cartDTO){
 return  modelMapper.map(cartDTO,CartEntity.class);
}

public CartDTO toDTO(CartEntity cartEntity){
 return  modelMapper.map(cartEntity,CartDTO.class);
}
}