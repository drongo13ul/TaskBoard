package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.BoardDto;
import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.entity.Boards;
import com.simbirsoft.taskboard.entity.Project;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {

    public static BoardDto BoardsToDto(Boards boards) {
        BoardDto boardDto = new BoardDto();
        boardDto.setName(boards.getName());
        boardDto.setProjectId(boards.getProjectId());
        boardDto.setTasks(boards.getTasks());
        return boardDto;
    }

    public Boards BoardsToEntity(BoardDto boardDto) {
        Boards boards = new Boards();
        boards.setName(boardDto.getName());
        boards.setProjectId(boardDto.getProjectId());
        boards.setTasks(boardDto.getTasks());
        return boards;
    }


}
