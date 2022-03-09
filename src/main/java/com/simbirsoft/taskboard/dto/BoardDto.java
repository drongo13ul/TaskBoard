package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Project;
import com.simbirsoft.taskboard.entity.Tasks;

import java.util.List;

public class BoardDto {
    private String name;
    private Project projectId;
    private List<Tasks> tasks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public List<Tasks> getTasks() {
        return tasks;
    }

    public void setTasks(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
