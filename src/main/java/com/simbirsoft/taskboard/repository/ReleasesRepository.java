package com.simbirsoft.taskboard.repository;

import com.simbirsoft.taskboard.entity.Releases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReleasesRepository extends JpaRepository <Releases, Long> {
}
