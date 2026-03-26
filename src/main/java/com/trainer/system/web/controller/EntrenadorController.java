package com.trainer.system.web.controller;

import com.trainer.system.persistence.crud.CrudEntrenadorEntity;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntrenadorController {
    private final CrudEntrenadorEntity crudEntrenadorEntity;

    public EntrenadorController(CrudEntrenadorEntity crudEntrenadorEntity) {
        this.crudEntrenadorEntity = crudEntrenadorEntity;
    }

    @GetMapping("/entrenadores")
    public List<EntrenadorEntity> getEntrenadores() {
        return (List<EntrenadorEntity>) this.crudEntrenadorEntity.findAll();
    }
}
