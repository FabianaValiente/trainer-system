package com.trainer.system.domain.dto;

public record EntrenadorDto(
        Integer id_entrenador,
        String nombre,
        String celular,
        String correo,
        boolean activo
) {
}
