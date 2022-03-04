package com.simbirsoft.taskboard.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Releases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version", columnDefinition = "varchar(500)", nullable = false)
    private String version;

    @Column(name = "time_begin")
    private LocalDate timeBegin;

    @Column(name = "time_final")
    private LocalDate timeFinal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LocalDate getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(LocalDate timeBegin) {
        this.timeBegin = timeBegin;
    }

    public LocalDate getTimeFinal() {
        return timeFinal;
    }

    public void setTimeFinal(LocalDate timeFinal) {
        this.timeFinal = timeFinal;
    }
}
