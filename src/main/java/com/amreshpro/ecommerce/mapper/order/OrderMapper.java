package com.amreshpro.ecommerce.mapper.order;

import com.amreshpro.ecommerce.dto.order.OrderDTO;
import com.amreshpro.ecommerce.entity.order.OrderEntity;
import org.modelmapper.ModelMapper;

public  class OrderMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    OrderEntity toEntity(OrderDTO OrderDTO){
        return  modelMapper.map(OrderDTO,OrderEntity.class);
    }
    OrderDTO toDTO(OrderEntity OrderEntity){
        return  modelMapper.map(OrderEntity,OrderDTO.class);
    }
}