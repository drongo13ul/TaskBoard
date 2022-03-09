package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository <Roles, Long> {
}
