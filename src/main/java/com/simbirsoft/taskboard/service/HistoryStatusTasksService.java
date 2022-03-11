package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.HistoryStatusTasksDto;
import com.simbirsoft.taskboard.dto.UsersDto;

import java.util.List;

public interface HistoryStatusTasksService {
    HistoryStatusTasksDto createHistoryStatusTasks (HistoryStatusTasksDto historyStatusTasksDto);

    List<HistoryStatusTasksDto> findAll();

    void delete (Long id);
}
