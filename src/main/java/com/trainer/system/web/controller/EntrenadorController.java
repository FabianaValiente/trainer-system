package com.trainer.system.web.controller;

import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.domain.service.EntrenadorService;
import com.trainer.system.persistence.crud.CrudEntrenadorEntity;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {
    private final EntrenadorService entrenadorService;

    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public List<EntrenadorDto> getEntrenadores() {
        return (List<EntrenadorDto>) this.entrenadorService.getEntrenadores();
    }

    @GetMapping("/{id}")
    public EntrenadorDto getEntrenador(@PathVariable Integer id) {
        return this.entrenadorService.getEntrenador(id);
    }
}
