package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;

    @OneToMany(mappedBy = "users")
    private List<ProjectUsersRoles> projectUsersRoles;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Tasks users;

    public Tasks getUsers() {
        return users;
    }

    public void setUsers(Tasks users) {
        this.users = users;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String id) {
        this.name = name;
    }

    public List<ProjectUsersRoles> getProjectUsersRoles() {
        return projectUsersRoles;
    }

    public void setProjectUsersRoles(List<ProjectUsersRoles> projectUsersRoles) {
        this.projectUsersRoles = projectUsersRoles;
    }
}
