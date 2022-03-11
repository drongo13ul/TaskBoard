package com.simbirsoft.taskboard.dto;

import com.simbirsoft.taskboard.entity.Tasks;

import java.time.LocalDate;

public class ReleasesDto {

    private String version;
    private LocalDate timeBegin;
    private LocalDate timeFinal;
    private Tasks releasesId;

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

    public Tasks getReleasesId() {
        return releasesId;
    }

    public void setReleasesId(Tasks releasesId) {
        this.releasesId = releasesId;
    }
}
