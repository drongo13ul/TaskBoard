package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.ReleasesDto;
import com.simbirsoft.taskboard.dto.UsersDto;

import java.util.List;


public interface ReleasesService {
    ReleasesDto createRelease (ReleasesDto releasesDto);

    List<ReleasesDto> findAll();

    void delete (Long id);
}
