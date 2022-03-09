package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.BoardDto;
import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.service.BoardService;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Boards controller", description = "Boards controller / Управление доской задач")
@RestController
@RequestMapping("/boards")
public class BoardsController {

    private final BoardService boardService;

    @Autowired
    public BoardsController(BoardService boardService) {
        this.boardService = boardService;
    }


    @PostMapping
    public ResponseEntity<BoardDto> createBoard(@RequestBody BoardDto boardDto) {
        return ResponseEntity.ok(boardService.createBoard(boardDto));
    }

    @GetMapping
    public ResponseEntity<List<BoardDto>> findAll() {
        return ResponseEntity.ok(boardService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boardService.delete(id);
        return ResponseEntity.ok("Ok.");
    }


}
