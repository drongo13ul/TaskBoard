package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Boards;
import com.simbirsoft.taskboard.entity.HistoryStatusProjects;
import com.simbirsoft.taskboard.entity.ProjectUsersRoles;

import java.util.List;

public class ProjectDto {
    private String name;
    private String description;
    private HistoryStatusProjects historyId;
    private List<HistoryStatusProjects> historyStatusProjects;
    private List<Boards> boards;
    private List<ProjectUsersRoles> projectUserRoleList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HistoryStatusProjects getHistoryId() {
        return historyId;
    }

    public void setHistoryId(HistoryStatusProjects historyId) {
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
