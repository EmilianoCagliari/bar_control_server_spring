package com.barcontrol.server.repository;

import com.barcontrol.server.entity.WeightRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IWeightRegRepository extends JpaRepository<WeightRegister, Integer>, JpaSpecificationExecutor<WeightRegister> {
}
