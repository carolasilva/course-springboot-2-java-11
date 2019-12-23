package com.carolinasilva.course.repositories;

import com.carolinasilva.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
