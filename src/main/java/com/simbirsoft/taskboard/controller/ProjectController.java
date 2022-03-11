package com.simbirsoft.taskboard.controller;
import com.simbirsoft.taskboard.dto.ProjectDto;
import com.simbirsoft.taskboard.service.ProjectService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Project controller", description = "Project controller / Управление проектом")
@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/create")
    @Operation(summary = "Создание проекта", description = "позволяет создать проект")
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto) {
        return ResponseEntity.ok(projectService.createProject(projectDto));
    }

    @GetMapping("findAll")
    public ResponseEntity<List<ProjectDto>> findAll() {
        return ResponseEntity.ok(projectService.findAll());
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        projectService.delete(id);
        return ResponseEntity.ok("Ok.");
    }

    @PostMapping("/{project-id}/update")
    public ResponseEntity updateProject(@PathVariable Long projectId, @RequestBody ProjectDto projectDto){
        return ResponseEntity.ok(projectService.update(projectId, projectDto));
    }


}
