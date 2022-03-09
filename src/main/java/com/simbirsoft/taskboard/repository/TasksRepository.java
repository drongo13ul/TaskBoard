package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TasksRepository extends JpaRepository <Tasks, Long> {
}
