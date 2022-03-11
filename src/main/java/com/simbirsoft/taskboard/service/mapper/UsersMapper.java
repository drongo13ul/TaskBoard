package com.simbirsoft.taskboard.service.mapper;

import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersMapper {
    public UsersDto UserToDto (Users users){
        UsersDto usersDto = new UsersDto();
        usersDto.setUsers(users.getUsers());
        usersDto.setName(users.getName());
        usersDto.setProjectUsersRoles(users.getProjectUsersRoles());
        return usersDto;
    }

    public  Users UsersToEntity (UsersDto usersDto){
        Users users = new Users();
        users.setUsers(usersDto.getUsers());
        users.setName(usersDto.getName());
        users.setProjectUsersRoles(usersDto.getProjectUsersRoles());
        return users;
    }

}
