package com.simbirsoft.taskboard.service;

import com.simbirsoft.taskboard.dto.UsersDto;

import java.util.List;

public interface UsersService {
    UsersDto createUser (UsersDto usersDto);

    List <UsersDto> findAll();

    void delete (Long id);
}
