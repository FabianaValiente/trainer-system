package com.trainer.system.domain.repository;

import com.trainer.system.domain.dto.EntrenadorDto;

import java.util.List;

public interface EntrenadorRepository {
    List<EntrenadorDto> getEntrenadores();
}
