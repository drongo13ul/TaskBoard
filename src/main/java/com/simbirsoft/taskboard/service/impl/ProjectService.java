package com.simbirsoft.taskboard.service.impl;

import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.entity.Project;
import com.simbirsoft.taskboard.exception.ProjectIdNotFoundException;
import com.simbirsoft.taskboard.repository.ProjectRepository;
import com.simbirsoft.taskboard.service.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService implements com.simbirsoft.taskboard.service.ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectService(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        return projectMapper.ProjectToDto(
                projectRepository.save(projectMapper.ProjectToEntity(projectDto)));
    }

    @Override
    public List<ProjectDto> findAll() {
        return projectRepository.findAll()
                .stream()
                .map((ProjectMapper::ProjectToDto))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectIdNotFoundException(id));
        projectRepository.delete(project);

    }
}
