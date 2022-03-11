package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.HistoryStatusTasksDto;
import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.service.impl.HistoryStatusTasksServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("history-status-task")
public class HistoryStatusTasksController {

    private  final HistoryStatusTasksServiceImpl historyStatusTasksService;

    @Autowired
    public HistoryStatusTasksController(HistoryStatusTasksServiceImpl historyStatusTasksService) {
        this.historyStatusTasksService = historyStatusTasksService;
    }

    @PostMapping("/create")
    @Operation(summary = "Создание истории статуса", description = "позволяет создать историю статуса")
    public ResponseEntity<HistoryStatusTasksDto> createUser(@RequestBody HistoryStatusTasksDto historyStatusTasksDto) {
        return ResponseEntity.ok(historyStatusTasksService.createHistoryStatusTasks(historyStatusTasksDto));
    }


    @GetMapping("/find-all")
    public ResponseEntity<List<HistoryStatusTasksDto>> findAll(){
        return ResponseEntity.ok(historyStatusTasksService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete (@PathVariable Long id){
        return  ResponseEntity.ok("Ok.");
    }


}
