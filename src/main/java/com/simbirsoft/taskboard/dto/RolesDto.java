package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.ProjectUsersRoles;


import java.util.List;

public class RolesDto {
    private String name;
    private List<ProjectUsersRoles> projectUsersRolesList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectUsersRoles> getProjectUsersRolesList() {
        return projectUsersRolesList;
    }

    public void setProjectUsersRolesList(List<ProjectUsersRoles> projectUsersRolesList) {
        this.projectUsersRolesList = projectUsersRolesList;
    }
}
