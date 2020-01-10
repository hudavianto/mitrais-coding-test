package com.mitrais.coding.test.demo.dao;

import com.mitrais.coding.test.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hudaavianto
 */
public interface UserRepository extends JpaRepository<User, Long> {

  User findUserByEmail(String email);

}
