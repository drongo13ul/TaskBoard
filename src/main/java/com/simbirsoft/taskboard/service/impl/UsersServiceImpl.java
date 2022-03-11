package com.simbirsoft.taskboard.service.impl;

import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
    @Override
    public UsersDto createUser(UsersDto usersDto) {
        return null;
    }

    @Override
    public List<UsersDto> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
