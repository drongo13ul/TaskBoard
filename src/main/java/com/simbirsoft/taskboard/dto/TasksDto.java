package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Boards;
import com.simbirsoft.taskboard.entity.HistoryStatusTasks;
import com.simbirsoft.taskboard.entity.Releases;
import com.simbirsoft.taskboard.entity.Users;


import java.util.List;

public class TasksDto {

    private String name;
    private Boards boardsId;
    private List<Users> authorId;
    private List<Users> executorId;
    private List<Releases> releases;
    private List<HistoryStatusTasks> historyStatusTasks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boards getBoardsId() {
        return boardsId;
    }

    public void setBoardsId(Boards boardsId) {
        this.boardsId = boardsId;
    }

    public List<Users> getAuthorId() {
        return authorId;
    }

    public void setAuthorId(List<Users> authorId) {
        this.authorId = authorId;
    }

    public List<Users> getExecutorId() {
        return executorId;
    }

    public void setExecutorId(List<Users> executorId) {
        this.executorId = executorId;
    }

    public List<Releases> getReleases() {
        return releases;
    }

    public void setReleases(List<Releases> releases) {
        this.releases = releases;
    }

    public List<HistoryStatusTasks> getHistoryStatusTasks() {
        return historyStatusTasks;
    }

    public void setHistoryStatusTasks(List<HistoryStatusTasks> historyStatusTasks) {
        this.historyStatusTasks = historyStatusTasks;
    }
}
