package com.trainer.system.web.controller;

import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.domain.service.EntrenadorService;
import com.trainer.system.persistence.crud.CrudEntrenadorEntity;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {
    private final EntrenadorService entrenadorService;

    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public ResponseEntity<List<EntrenadorDto>> getEntrenadores() {
        return ResponseEntity.ok(this.entrenadorService.getEntrenadores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntrenadorDto> getEntrenador(@PathVariable Integer id) {
        EntrenadorDto entrenadorDto = this.entrenadorService.getEntrenador(id);
        if (entrenadorDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entrenadorDto);
    }

    @PostMapping
    public void addEntrenador(@RequestBody EntrenadorDto entrenadorDto) {
        this.entrenadorService.addEntrenador(entrenadorDto);
    }
}
