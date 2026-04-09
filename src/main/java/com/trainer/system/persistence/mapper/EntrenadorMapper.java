package com.trainer.system.persistence.mapper;
import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrenadorMapper {
    @Mapping(source = "telefono", target = "celular")
    EntrenadorDto toDto(EntrenadorEntity entrenadorEntity);
    List<EntrenadorDto> toDto(Iterable<EntrenadorEntity> entrenadorEntities);

    @InheritInverseConfiguration
    EntrenadorEntity toEntity(EntrenadorDto entrenadorDto);
}
