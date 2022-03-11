package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.entity.Project;

import java.util.List;

public interface ProjectService {
    ProjectDto createProject(ProjectDto projectDto);

    List<ProjectDto> findAll();

    void delete(Long id);

    Project update(Long id, ProjectDto projectDto);
}
