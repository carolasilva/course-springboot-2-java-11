package com.carolinasilva.course.repositories;

import com.carolinasilva.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
