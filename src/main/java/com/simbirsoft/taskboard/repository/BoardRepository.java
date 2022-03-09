package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Boards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository <Boards, Long> {
}
