package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.ProjectUsersRolesDto;
import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.service.impl.ProjectUsersRolesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project-user-controller")
public class ProjectUsersRolesController {

    private final ProjectUsersRolesServiceImpl projectUsersRolesService;

    @Autowired
    public ProjectUsersRolesController(ProjectUsersRolesServiceImpl projectUsersRolesService) {
        this.projectUsersRolesService = projectUsersRolesService;
    }

    @PostMapping("/create")
    @Operation(summary = "Создание роли пользователя в проекте", description = "позволяет роль пользователя")
    public ResponseEntity<ProjectUsersRolesDto> createUser(@RequestBody ProjectUsersRolesDto projectUsersRolesDto) {
        return ResponseEntity.ok(projectUsersRolesService.createProjectUsersRoles(projectUsersRolesDto));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<ProjectUsersRolesDto>> findAll(){
        return ResponseEntity.ok(projectUsersRolesService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete (@PathVariable Long id){
        return  ResponseEntity.ok("Ok.");
    }
}
