package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.ProjectUsersRoles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectUserRolesRepository extends JpaRepository <ProjectUsersRoles, Long> {
}
