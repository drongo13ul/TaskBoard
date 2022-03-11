package com.simbirsoft.taskboard.controller;


import com.simbirsoft.taskboard.dto.BoardDto;
import com.simbirsoft.taskboard.dto.HistoryStatusProjectsDto;
import com.simbirsoft.taskboard.service.impl.HistoryStatusProjectsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("historyProject")
public class HistoryStatusProjectsController {


    private final HistoryStatusProjectsServiceImpl historyStatusProjectsService;

    @Autowired
    public HistoryStatusProjectsController(HistoryStatusProjectsServiceImpl historyStatusProjectsService) {
        this.historyStatusProjectsService = historyStatusProjectsService;
    }

    @PostMapping("/create")
    public ResponseEntity <HistoryStatusProjectsDto> createHistoryProject(@RequestBody HistoryStatusProjectsDto historyStatusProjectsDto){
        return ResponseEntity.ok(historyStatusProjectsService.createHistoryStatusProject(historyStatusProjectsDto));
    }


    @GetMapping("/find-all")
    public ResponseEntity<List<HistoryStatusProjectsDto>> findAll () {
        return ResponseEntity.ok(historyStatusProjectsService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete (@PathVariable Long id){
        historyStatusProjectsService.delete(id);
        return ResponseEntity.ok("ok.");
    }


}
