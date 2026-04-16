package com.trainer.system.persistence;

import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.domain.repository.EntrenadorRepository;
import com.trainer.system.persistence.crud.CrudEntrenadorEntity;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import com.trainer.system.persistence.mapper.EntrenadorMapper;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Collections;
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

    @Override
    public EntrenadorDto getEntrenador(Integer id) {
        EntrenadorEntity entrenadorEntity = this.crudEntrenadorEntity.findById(id).orElse(null);
        return this.entrenadorMapper.toDto(entrenadorEntity);
    }

    @Override
    public void addEntrenador(EntrenadorDto entrenadorDto) {
        this.crudEntrenadorEntity.save(this.entrenadorMapper.toEntity(entrenadorDto));
    }

    @Override
    public void updateEntrenador(Integer id, EntrenadorDto entrenadorDto) {
        EntrenadorEntity entrenadorEntity = this.crudEntrenadorEntity.findById(id).orElse(null);
        if(entrenadorEntity == null){
            throw new EntityNotFoundException("Entrenador no encontrado");
        }
        System.out.printf("update entrenador:" + entrenadorDto);
        System.out.printf("\nentrenador entity:" + entrenadorEntity);
        this.entrenadorMapper.updateEntityFromDto(entrenadorDto,entrenadorEntity);
        this.crudEntrenadorEntity.save(entrenadorEntity);
    }

    @Override
    public void deleteEntrenador(Integer id) {
        EntrenadorEntity entrenadorEntity = this.crudEntrenadorEntity.findById(id).orElse(null);
        this.crudEntrenadorEntity.delete(entrenadorEntity);
    }
}
