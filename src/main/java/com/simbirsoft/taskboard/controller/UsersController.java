package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.service.impl.UsersServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Users controller", description = "Users controller / Управление пользователями")
@RestController
@RequestMapping("users")
public class UsersController {

    private final UsersServiceImpl usersService;

    @Autowired
    public UsersController(UsersServiceImpl usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/create")
    @Operation(summary = "Создание пользователя", description = "позволяет создать пользователя")
    public ResponseEntity<UsersDto> createUser(@RequestBody UsersDto usersDto) {
        return ResponseEntity.ok(usersService.createUser(usersDto));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<UsersDto>> findAll(){
        return ResponseEntity.ok(usersService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity <String> delete (@PathVariable Long id){
        return  ResponseEntity.ok("Ok.");
    }

}
