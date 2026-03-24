package com.trainer.system.web.controller;

import com.trainer.system.persistence.crud.CrudEntrenadorEntity;

public class EntrenadorController {
    private final CrudEntrenadorEntity crudEntrenadorEntity;

    public EntrenadorController(CrudEntrenadorEntity crudEntrenadorEntity) {
        this.crudEntrenadorEntity = crudEntrenadorEntity;
    }
}
