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
public class ProjectServiceImpl implements com.simbirsoft.taskboard.service.ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
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

    @Override
    public Project update(Long id, ProjectDto projectDto) {
        Project projectTemp = projectRepository.findById(id)
                .orElseThrow(()->new ProjectIdNotFoundException(id));

//        Project projectTemp = projectRepository.getById(projectId);
        projectTemp.setName(projectDto.getName());
        projectTemp.setBoards(projectDto.getBoards());
        projectTemp.setDescription(projectDto.getDescription());
        projectTemp.setProjectUserRoleList(projectDto.getProjectUserRoleList());
        projectTemp.setHistoryId(projectDto.getHistoryId());
        projectTemp.setHistoryStatusProjects(projectDto.getHistoryStatusProjects());
        projectTemp.setProjectUserRoleList(projectDto.getProjectUserRoleList());
        projectRepository.save(projectTemp);
        return projectTemp;
    }
}
