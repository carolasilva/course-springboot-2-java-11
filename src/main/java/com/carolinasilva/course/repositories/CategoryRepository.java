package com.carolinasilva.course.repositories;

import com.carolinasilva.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
