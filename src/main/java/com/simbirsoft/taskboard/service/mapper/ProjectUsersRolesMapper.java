package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.ProjectUsersRolesDto;
import com.simbirsoft.taskboard.entity.ProjectUsersRoles;

public class ProjectUsersRolesMapper {

    public ProjectUsersRolesDto ProjectUsersRolesToDto (ProjectUsersRoles projectUsersRoles){
        ProjectUsersRolesDto projectUsersRolesDto = new ProjectUsersRolesDto();
        projectUsersRolesDto.setProjectIdUser(projectUsersRoles.getProjectIdUser());
        projectUsersRolesDto.setRoles(projectUsersRoles.getRoles());
        projectUsersRolesDto.setUsers(projectUsersRoles.getUsers());
        return projectUsersRolesDto;
    }

    public ProjectUsersRoles ProjectUsersRolesTo (ProjectUsersRolesDto projectUsersRolesDto){
        ProjectUsersRoles projectUsersRoles = new ProjectUsersRoles();
        projectUsersRoles.setProjectIdUser(projectUsersRolesDto.getProjectIdUser());
        projectUsersRoles.setRoles(projectUsersRolesDto.getRoles());
        projectUsersRoles.setUsers(projectUsersRolesDto.getUsers());
        return projectUsersRoles;
    }
}
