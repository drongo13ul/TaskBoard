package com.simbirsoft.taskboard.service.impl;

import com.simbirsoft.taskboard.dto.TasksDto;
import com.simbirsoft.taskboard.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Override
    public TasksDto createTask(TasksDto tasksDto) {
        return null;
    }

    @Override
    public List<TasksDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
