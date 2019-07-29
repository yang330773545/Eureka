package org.baoshan.oauthservice.repository;

import org.baoshan.oauthservice.entity.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
