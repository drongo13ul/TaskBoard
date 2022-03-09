package com.simbirsoft.taskboard.service.impl;

import com.simbirsoft.taskboard.dto.BoardDto;
import com.simbirsoft.taskboard.entity.Boards;
import com.simbirsoft.taskboard.exception.BoardIdNotFoundException;
import com.simbirsoft.taskboard.repository.BoardRepository;
import com.simbirsoft.taskboard.service.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BoardService implements com.simbirsoft.taskboard.service.BoardService {

    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    @Autowired
    public BoardService(BoardRepository boardRepository, BoardMapper boardMapper) {
        this.boardRepository = boardRepository;
        this.boardMapper = boardMapper;
    }

    @Override
    public BoardDto createBoard(BoardDto boardDto) {
        return boardMapper.BoardsToDto(
                boardRepository.save(boardMapper.BoardsToEntity(boardDto)));
    }

    @Override
    public List<BoardDto> findAll() {
        return boardRepository.findAll()
                .stream()
                .map((BoardMapper::BoardsToDto))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Boards boards = boardRepository.findById(id)
                .orElseThrow(() -> new BoardIdNotFoundException(id));
        boardRepository.delete(boards);

    }
}
