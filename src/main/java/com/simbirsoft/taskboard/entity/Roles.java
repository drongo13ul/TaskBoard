package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;


    @OneToMany(mappedBy = "roles")
    private List<ProjectUsersRoles> projectUsersRolesList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
