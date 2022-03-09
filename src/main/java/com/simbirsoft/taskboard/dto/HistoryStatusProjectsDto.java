package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Project;
import com.simbirsoft.taskboard.entity.Statuses;

import java.time.LocalDate;
import java.util.List;

public class HistoryStatusProjectsDto {
    private LocalDate localDate;
    private Statuses statusProjectsId;
    private Project owner;
    private List<Project> projects;

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Statuses getStatusProjectsId() {
        return statusProjectsId;
    }

    public void setStatusProjectsId(Statuses statusProjectsId) {
        this.statusProjectsId = statusProjectsId;
    }

    public Project getOwner() {
        return owner;
    }

    public void setOwner(Project owner) {
        this.owner = owner;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
