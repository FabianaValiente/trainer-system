package com.trainer.system.persistence.mapper;
import com.trainer.system.domain.dto.EntrenadorDto;
import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EntrenadorMapper {
    EntrenadorDto toDto(EntrenadorEntity entrenadorEntity);
    List<EntrenadorDto> toDto(Iterable<EntrenadorEntity> entrenadorEntities);
}
