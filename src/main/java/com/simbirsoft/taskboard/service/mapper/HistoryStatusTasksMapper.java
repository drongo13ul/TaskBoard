package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.HistoryStatusTasksDto;
import com.simbirsoft.taskboard.entity.HistoryStatusTasks;
import org.springframework.stereotype.Component;

@Component
public class HistoryStatusTasksMapper {

    public HistoryStatusTasksDto HistoryStatusTasksToDto (HistoryStatusTasks historyStatusTasks){
        HistoryStatusTasksDto historyStatusTasksDto = new HistoryStatusTasksDto();
        historyStatusTasksDto.setHistoryStatusTasksId(historyStatusTasks.getHistoryStatusTasksId());
        historyStatusTasksDto.setStatuses(historyStatusTasks.getStatuses());
        historyStatusTasksDto.setTime(historyStatusTasks.getTime());
       return  historyStatusTasksDto;
    }

    public HistoryStatusTasks HistoryStatusTasksToEntity (HistoryStatusTasksDto historyStatusTasksDto){
        HistoryStatusTasks historyStatusTasks = new HistoryStatusTasks();
        historyStatusTasks.setHistoryStatusTasksId(historyStatusTasksDto.getHistoryStatusTasksId());
        historyStatusTasks.setStatuses(historyStatusTasksDto.getStatuses());
        historyStatusTasks.setTime(historyStatusTasksDto.getTime());
        return  historyStatusTasks;
    }

}
