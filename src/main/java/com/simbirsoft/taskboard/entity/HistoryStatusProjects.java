package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class HistoryStatusProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "statusProjects")
    private Statuses statusProjectsId;


    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Project owner;

    @OneToMany(mappedBy = "historyId")
    private List<Project> projects;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Project getOwner() {
        return owner;
    }

    public void setOwner(Project owner) {
        this.owner = owner;
    }

    public Statuses getStatusProjectsId() {
        return statusProjectsId;
    }

    public void setStatusProjectsId(Statuses statusProjectsId) {
        this.statusProjectsId = statusProjectsId;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
