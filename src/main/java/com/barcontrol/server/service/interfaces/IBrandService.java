package com.barcontrol.server.service.interfaces;

import com.barcontrol.server.entity.Brand;

import java.util.List;

public interface IBrandService {

    /* Lista de marcas*/
    List<Brand> getBrands();

    // Obtener una sola marca
    Brand getBrand( Integer id );

    /* Crear Marca */
    Brand createBrand( Brand brand );


}
