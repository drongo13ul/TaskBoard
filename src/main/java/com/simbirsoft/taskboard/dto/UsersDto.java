package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.ProjectUsersRoles;
import com.simbirsoft.taskboard.entity.Tasks;

import java.util.List;

public class UsersDto {
    private String name;
    private List<ProjectUsersRoles> projectUsersRoles;
    private Tasks users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectUsersRoles> getProjectUsersRoles() {
        return projectUsersRoles;
    }

    public void setProjectUsersRoles(List<ProjectUsersRoles> projectUsersRoles) {
        this.projectUsersRoles = projectUsersRoles;
    }

    public Tasks getUsers() {
        return users;
    }

    public void setUsers(Tasks users) {
        this.users = users;
    }
}
