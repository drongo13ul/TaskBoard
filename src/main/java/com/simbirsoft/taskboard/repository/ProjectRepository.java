package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Long> {
}
