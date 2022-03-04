package com.simbirsoft.taskboard.entity;

import javax.persistence.*;

@Entity
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "boardsId")
    private  Boards boardsId;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    private String name;



}
