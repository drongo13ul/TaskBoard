package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Statuses;
import com.simbirsoft.taskboard.entity.Tasks;


import java.time.LocalDate;
import java.util.List;

public class HistoryStatusTasksDto {

    private LocalDate time;
    private Tasks historyStatusTasksId;
    private List<Statuses> statuses;

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public Tasks getHistoryStatusTasksId() {
        return historyStatusTasksId;
    }

    public void setHistoryStatusTasksId(Tasks historyStatusTasksId) {
        this.historyStatusTasksId = historyStatusTasksId;
    }

    public List<Statuses> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Statuses> statuses) {
        this.statuses = statuses;
    }
}
