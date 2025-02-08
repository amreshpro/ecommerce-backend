package com.amreshpro.ecommerce.mapper.payment;

import com.amreshpro.ecommerce.dto.payment.PaymentDTO;
import com.amreshpro.ecommerce.entity.payment.PaymentEntity;
import org.modelmapper.ModelMapper;

public  class PaymentMapper {
    private final ModelMapper modelMapper = new ModelMapper();
    PaymentEntity toEntity(PaymentDTO PaymentDTO){
        return  modelMapper.map(PaymentDTO,PaymentEntity.class);
    }
    PaymentDTO toDTO(PaymentEntity PaymentEntity){
        return  modelMapper.map(PaymentEntity,PaymentDTO.class);
    }
}