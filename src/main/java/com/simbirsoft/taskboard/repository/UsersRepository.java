package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
