package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.BoardDto;

import java.util.List;

public interface BoardService {
    BoardDto createBoard(BoardDto boardDto);

    List<BoardDto> findAll();

    void delete(Long id);
}
