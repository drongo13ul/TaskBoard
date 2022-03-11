package com.simbirsoft.taskboard.controller;

import com.simbirsoft.taskboard.dto.ReleasesDto;
import com.simbirsoft.taskboard.dto.UsersDto;
import com.simbirsoft.taskboard.service.impl.ReleasesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("release")
public class ReleasesController {

    private  final ReleasesServiceImpl releasesService;

    @Autowired
    public ReleasesController(ReleasesServiceImpl releasesService) {
        this.releasesService = releasesService;
    }

    @PostMapping("/create")
    @Operation(summary = "Создание релиза", description = "позволяет создать релиз")
    public ResponseEntity<ReleasesDto> createReleases(@RequestBody ReleasesDto releasesDto) {
        return ResponseEntity.ok(releasesService.createRelease(releasesDto));
    }

    @GetMapping("/find-all")
    public ResponseEntity<List<ReleasesDto>> findAll(){
        return ResponseEntity.ok(releasesService.findAll());
    }


    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> delete (@PathVariable Long id){
        return  ResponseEntity.ok("Ok.");
    }

}
