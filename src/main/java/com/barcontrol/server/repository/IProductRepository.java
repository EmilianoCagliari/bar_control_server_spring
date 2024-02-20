package com.barcontrol.server.repository;

import com.barcontrol.server.entity.Brand;
import com.barcontrol.server.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IProductRepository extends JpaRepository<Product, Integer>, JpaSpecificationExecutor<Brand> {
}
