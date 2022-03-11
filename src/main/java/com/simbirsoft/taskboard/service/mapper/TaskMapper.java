package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.TasksDto;
import com.simbirsoft.taskboard.entity.Tasks;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {
    public TasksDto TasksToDto(Tasks tasks) {
        TasksDto tasksDto = new TasksDto();
        tasksDto.setName(tasks.getName());
        tasksDto.setAuthorId(tasks.getAuthorId());
        tasksDto.setBoardsId(tasks.getBoardsId());
        tasksDto.setHistoryStatusTasks(tasks.getHistoryStatusTasks());
        tasksDto.setReleases(tasks.getReleases());
        tasksDto.setAuthorId(tasks.getAuthorId());
        tasksDto.setExecutorId(tasks.getExecutorId());
        return tasksDto;
    }

    public Tasks TasksToEntity (TasksDto tasksDto){
        Tasks tasks = new Tasks();
        tasks.setName(tasksDto.getName());
        tasks.setAuthorId(tasksDto.getAuthorId());
        tasks.setBoardsId(tasksDto.getBoardsId());
        tasks.setHistoryStatusTasks(tasksDto.getHistoryStatusTasks());
        tasks.setReleases(tasksDto.getReleases());
        tasks.setAuthorId(tasksDto.getAuthorId());
        tasks.setExecutorId(tasksDto.getExecutorId());
        return tasks;
    }


}
