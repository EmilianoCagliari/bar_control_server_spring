package com.barcontrol.server.repository;

import com.barcontrol.server.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IBrandRepository extends JpaRepository<Brand, Integer>, JpaSpecificationExecutor<Brand> {
}
