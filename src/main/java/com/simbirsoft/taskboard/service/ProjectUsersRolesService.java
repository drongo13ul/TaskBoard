package com.simbirsoft.taskboard.service;


import com.simbirsoft.taskboard.dto.ProjectUsersRolesDto;
import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.entity.ProjectUsersRoles;

import java.util.List;

public interface ProjectUsersRolesService {
    ProjectUsersRolesDto createProjectUsersRoles (ProjectUsersRolesDto projectUsersRolesDto);

    List<ProjectUsersRolesDto> findAll();

    void delete (Long id);
}
