package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;

    @Column(name = "description", columnDefinition = "varchar(500)", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "HistoryStatusProjects_id")
    private HistoryStatusProjects historyId;


    @OneToMany(mappedBy = "owner")
    private List<HistoryStatusProjects> historyStatusProjects;

    @OneToMany(mappedBy = "projectId")
    private List<Boards> boards;

    @OneToMany(mappedBy = "projectIdUser")
    private List<ProjectUsersRoles> projectUserRoleList;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public void setName(String name) {
        this.name = name;
    }

    public HistoryStatusProjects getHistoryId() {
        return historyId;
    }

    public void setHistoryId (HistoryStatusProjects historyStatusProjects){
        this.historyStatusProjects = (List<HistoryStatusProjects>) historyStatusProjects;
    }

    public void setHistoryStatusProjectsId(Long historyStatusProjectsId) {
        this.historyId = historyId;
    }


    public List<HistoryStatusProjects> getHistoryStatusProjects() {
        return historyStatusProjects;
    }

    public void setHistoryStatusProjects(List<HistoryStatusProjects> historyStatusProjects) {
        this.historyStatusProjects = historyStatusProjects;
    }

    public List<Boards> getBoards() {
        return boards;
    }

    public void setBoards(List<Boards> boards) {
        this.boards = boards;
    }

    public List<ProjectUsersRoles> getProjectUserRoleList() {
        return projectUserRoleList;
    }

    public void setProjectUserRoleList(List<ProjectUsersRoles> projectUserRoleList) {
        this.projectUserRoleList = projectUserRoleList;
    }
}
