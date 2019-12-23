package com.carolinasilva.course.repositories;

import com.carolinasilva.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
