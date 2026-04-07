package com.trainer.system.domain.service;

import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.domain.repository.EntrenadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {
    private final EntrenadorRepository entrenadorRepository;

    public EntrenadorService(EntrenadorRepository entrenadorRepository) {
        this.entrenadorRepository = entrenadorRepository;
    }

    public List<EntrenadorDto> getEntrenadores() {
        return entrenadorRepository.getEntrenadores();
    }
}
