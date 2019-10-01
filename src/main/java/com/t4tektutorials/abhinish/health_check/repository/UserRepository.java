package com.t4tektutorials.abhinish.health_check.repository;

import com.t4tektutorials.abhinish.health_check.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface User repository.
 *
 * @author Raj, Abhinish
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {}