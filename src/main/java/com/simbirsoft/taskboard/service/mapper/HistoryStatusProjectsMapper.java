package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.HistoryStatusProjectsDto;
import com.simbirsoft.taskboard.entity.HistoryStatusProjects;
import org.springframework.stereotype.Component;

@Component
public class HistoryStatusProjectsMapper {

    public HistoryStatusProjectsDto HistoryStatusProjectToDto (HistoryStatusProjects historyStatusProjects){
        HistoryStatusProjectsDto historyStatusProjectsDto = new HistoryStatusProjectsDto();
        historyStatusProjectsDto.setProjects(historyStatusProjects.getProjects());
        historyStatusProjectsDto.setStatusProjectsId(historyStatusProjects.getStatusProjectsId());
        historyStatusProjectsDto.setLocalDate(historyStatusProjects.getLocalDate());
        historyStatusProjectsDto.setOwner(historyStatusProjects.getOwner());
        return historyStatusProjectsDto;
    }

    public HistoryStatusProjects HistoryStatusProjectToEntity (HistoryStatusProjectsDto historyStatusProjectsDto){
        HistoryStatusProjects historyStatusProjects = new HistoryStatusProjects();
        historyStatusProjects.setProjects(historyStatusProjectsDto.getProjects());
        historyStatusProjects.setStatusProjectsId(historyStatusProjectsDto.getStatusProjectsId());
        historyStatusProjects.setOwner(historyStatusProjectsDto.getOwner());
        historyStatusProjects.setLocalDate(historyStatusProjectsDto.getLocalDate());
        return historyStatusProjects;
    }

}
