package com.simbirsoft.taskboard.service;


import com.simbirsoft.taskboard.dto.TasksDto;

import java.util.List;

public interface TaskService {
    TasksDto createTask (TasksDto tasksDto);

    List<TasksDto> findAll();

    void delete(Long id);
}
