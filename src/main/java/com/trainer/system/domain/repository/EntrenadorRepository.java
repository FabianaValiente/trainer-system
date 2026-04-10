package com.trainer.system.domain.repository;

import com.trainer.system.domain.dto.EntrenadorDto;

import java.util.List;

public interface EntrenadorRepository {
    List<EntrenadorDto> getEntrenadores();
    EntrenadorDto getEntrenador(Integer id);
    void addEntrenador(EntrenadorDto entrenadorDto);
    void updateEntrenador(Integer id, EntrenadorDto entrenadorDto);
    void deleteEntrenador(Integer id);
}
