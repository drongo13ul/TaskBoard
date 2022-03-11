package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.HistoryStatusProjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryStatusProjectsRepository extends JpaRepository <HistoryStatusProjects, Long> {
}
