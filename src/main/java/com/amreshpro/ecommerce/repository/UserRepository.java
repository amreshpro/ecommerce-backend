package com.amreshpro.ecommerce.repository;

import com.amreshpro.ecommerce.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,String> {
}