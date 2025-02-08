package com.amreshpro.ecommerce.mapper.product;

import com.amreshpro.ecommerce.dto.product.ProductDTO;
import com.amreshpro.ecommerce.entity.product.ProductEntity;
import org.modelmapper.ModelMapper;

public  class ProductMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    ProductEntity toEntity(ProductDTO ProductDTO){
        return  modelMapper.map(ProductDTO,ProductEntity.class);
    }
    ProductDTO toDTO(ProductEntity ProductEntity){
        return  modelMapper.map(ProductEntity,ProductDTO.class);
    }
}