package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "boardsId")
    private Boards boardsId;


    @OneToMany(mappedBy = "users")
    private List<Users> authorId;

    @OneToMany(mappedBy = "users")
    private List<Users> executorId;

    @OneToMany(mappedBy = "releasesId")
    private List<Releases> releases;

    @OneToMany(mappedBy = "historyStatusTasksId")
    private List<HistoryStatusTasks> historyStatusTasks;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
