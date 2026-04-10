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
        return this.entrenadorRepository.getEntrenadores();
    }

    public EntrenadorDto getEntrenador(Integer id) {
        return this.entrenadorRepository.getEntrenador(id);
    }

    public void addEntrenador(EntrenadorDto entrenadorDto) {
        this.entrenadorRepository.addEntrenador(entrenadorDto);
    }

    public void updateEntrenador(Integer id, EntrenadorDto entrenadorDto) {
        this.entrenadorRepository.updateEntrenador(id,entrenadorDto);
    }

    public void deleteEntrenador(Integer id) {
        this.entrenadorRepository.deleteEntrenador(id);
    }

}
