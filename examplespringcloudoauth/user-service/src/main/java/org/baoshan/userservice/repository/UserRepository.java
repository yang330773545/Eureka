package org.baoshan.userservice.repository;

import org.baoshan.userservice.entity.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
