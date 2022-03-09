package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class HistoryStatusTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private LocalDate time;

    @ManyToOne
    @JoinColumn(name = "history_status_tasks_id_id")
    private Tasks historyStatusTasksId;

    @OneToMany(mappedBy = "statusesId")
    private List<Statuses> statuses;

    public Tasks getHistoryStatusTasksId() {
        return historyStatusTasksId;
    }

    public void setHistoryStatusTasksId(Tasks historyStatusTasksId) {
        this.historyStatusTasksId = historyStatusTasksId;
    }

    public List<Statuses> getStatuses() {
        return statuses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
