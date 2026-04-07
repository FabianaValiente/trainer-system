package com.trainer.system.persistence;

import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.domain.repository.EntrenadorRepository;
import com.trainer.system.persistence.crud.CrudEntrenadorEntity;
import com.trainer.system.persistence.mapper.EntrenadorMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EntrenadorEntityRepository implements EntrenadorRepository {
    private final CrudEntrenadorEntity crudEntrenadorEntity;
    private final EntrenadorMapper entrenadorMapper;

    public EntrenadorEntityRepository(CrudEntrenadorEntity crudEntrenadorEntity, EntrenadorMapper entrenadorMapper) {
        this.crudEntrenadorEntity = crudEntrenadorEntity;
        this.entrenadorMapper = entrenadorMapper;
    }

    @Override
    public List<EntrenadorDto> getEntrenadores() {
        return this.entrenadorMapper.toDto(this.crudEntrenadorEntity.findAll());
    }
}
