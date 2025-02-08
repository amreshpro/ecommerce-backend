package com.amreshpro.ecommerce.mapper.customer;

import com.amreshpro.ecommerce.dto.customer.CustomerDTO;
import com.amreshpro.ecommerce.entity.customer.CustomerEntity;
import org.modelmapper.ModelMapper;

public  class CustomerMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    CustomerEntity toEntity(CustomerDTO CustomerDTO){
        return  modelMapper.map(CustomerDTO,CustomerEntity.class);
    }
    CustomerDTO toDTO(CustomerEntity CustomerEntity){
        return  modelMapper.map(CustomerEntity,CustomerDTO.class);
    }
}