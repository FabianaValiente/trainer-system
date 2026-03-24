package com.trainer.system.persistence.crud;

import com.trainer.system.persistence.entity.EntrenadorEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudEntrenadorEntity extends CrudRepository<EntrenadorEntity,Integer> {
}
