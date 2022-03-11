package com.simbirsoft.taskboard.entity;

import javax.persistence.*;

@Entity
public class ProjectUsersRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "project_id_user_id")
    private Project projectIdUser;


    @ManyToOne
    @JoinColumn(name = "roleUser")
    private Roles roles;


    @ManyToOne
    @JoinColumn(name = "Users")
    private Users users;

    public void setUsers(Users users) {
        this.users = users;
    }
    public Users getUsers() {
        return users;
    }

    public Project getProjectIdUser() {
        return projectIdUser;
    }
    public void setProjectIdUser(Project projectIdUser) {
        this.projectIdUser = projectIdUser;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Roles getRoles() {
        return roles;
    }
    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
