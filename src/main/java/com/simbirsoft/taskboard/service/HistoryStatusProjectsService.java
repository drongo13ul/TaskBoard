package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.HistoryStatusProjectsDto;

import java.util.List;

public interface HistoryStatusProjectsService {
    HistoryStatusProjectsDto createHistoryStatusProject (HistoryStatusProjectsDto historyStatusProjectsDto);

    List<HistoryStatusProjectsDto> findAll();

    void delete (Long id);

}
