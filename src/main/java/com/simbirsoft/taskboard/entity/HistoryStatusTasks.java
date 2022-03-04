package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class HistoryStatusTasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time")
    private LocalDate time;
}
