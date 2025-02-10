package com.amreshpro.ecommerce.repository;

import com.amreshpro.ecommerce.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity,String> {
}