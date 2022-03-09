package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.HistoryStatusProjects;
import com.simbirsoft.taskboard.entity.HistoryStatusTasks;

import java.util.List;

public class StatusesDto {

    private String name;
    private List<HistoryStatusProjects> statusProjects;
    private HistoryStatusTasks statusesId;

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

    public HistoryStatusTasks getStatusesId() {
        return statusesId;
    }

    public void setStatusesId(HistoryStatusTasks statusesId) {
        this.statusesId = statusesId;
    }
}
