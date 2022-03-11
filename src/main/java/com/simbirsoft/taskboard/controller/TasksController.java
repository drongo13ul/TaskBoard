package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.TasksDto;
import com.simbirsoft.taskboard.service.impl.TaskServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Tasks controller", description = "Tasks controller / Управление задачами")
@RestController
@RequestMapping("/tasks")
public class TasksController {

    private  final TaskServiceImpl taskService;

    @Autowired
    public TasksController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create")
    public ResponseEntity<TasksDto> createTask(@RequestBody TasksDto tasksDto){
        return ResponseEntity.ok(taskService.createTask(tasksDto));
    }

    @GetMapping("/find-all")
    public  ResponseEntity <List<TasksDto>> findAll (){
        return ResponseEntity.ok(taskService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity <String> delete (@PathVariable Long id){
        return  ResponseEntity.ok("Ok.");
    }


}
