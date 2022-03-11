package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Statuses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusesRepository extends JpaRepository <Statuses, Long> {
}
