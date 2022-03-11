package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper {

    public static ProjectDto ProjectToDto(Project project) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setName(project.getName());
        projectDto.setBoards(project.getBoards());
        projectDto.setDescription(project.getDescription());
        projectDto.setProjectUserRoleList(project.getProjectUserRoleList());
        projectDto.setHistoryStatusProjects(project.getHistoryStatusProjects());
        projectDto.setHistoryId(project.getHistoryId());
        return projectDto;
    }

    public Project ProjectToEntity(ProjectDto projectDto) {
        Project project = new Project();
        project.setName(projectDto.getName());
        project.setBoards(projectDto.getBoards());
        project.setDescription(projectDto.getDescription());
        project.setProjectUserRoleList(projectDto.getProjectUserRoleList());
        project.setHistoryStatusProjects(projectDto.getHistoryStatusProjects());
        project.setHistoryId(projectDto.getHistoryId());

        return project;
    }

}
