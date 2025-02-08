package com.amreshpro.ecommerce.mapper.category;

import com.amreshpro.ecommerce.dto.category.CategoryDTO;
import com.amreshpro.ecommerce.entity.category.CategoryEntity;
import org.modelmapper.ModelMapper;

public  class CategoryMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    CategoryEntity toEntity(CategoryDTO categoryDTO){
        return  modelMapper.map(categoryDTO,CategoryEntity.class);
    }
    CategoryDTO toDTO(CategoryEntity categoryEntity){
        return  modelMapper.map(categoryEntity,CategoryDTO.class);
    }
}