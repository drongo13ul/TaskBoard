package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Statuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;

    @OneToMany(mappedBy = "statusProjectsId")
    private List<HistoryStatusProjects> statusProjects;


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

    public List<HistoryStatusProjects> getStatusProjects() {
        return statusProjects;
    }

    public void setStatusProjects(List<HistoryStatusProjects> statusProjects) {
        this.statusProjects = statusProjects;
    }
}
