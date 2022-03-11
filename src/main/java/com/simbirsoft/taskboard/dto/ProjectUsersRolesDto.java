package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Project;
import com.simbirsoft.taskboard.entity.Roles;
import com.simbirsoft.taskboard.entity.Users;



public class ProjectUsersRolesDto {

    private Project projectIdUser;
    private Roles roles;
    private Users users;

    public Project getProjectIdUser() {
        return projectIdUser;
    }

    public void setProjectIdUser(Project projectIdUser) {
        this.projectIdUser = projectIdUser;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
