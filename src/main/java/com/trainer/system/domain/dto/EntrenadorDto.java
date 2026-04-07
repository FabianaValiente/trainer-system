package com.trainer.system.domain.dto;

public record EntrenadorDto(
        Integer id_entrenador,
        String nombre,
        String telefono,
        String correo,
        boolean activo
) {
}
