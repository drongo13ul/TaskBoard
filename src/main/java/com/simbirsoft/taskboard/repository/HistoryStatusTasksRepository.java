package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.HistoryStatusTasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryStatusTasksRepository extends JpaRepository <HistoryStatusTasks, Long> {
}
