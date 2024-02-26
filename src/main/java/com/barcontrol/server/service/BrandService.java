package com.barcontrol.server.service;

import com.barcontrol.server.entity.Brand;
import com.barcontrol.server.repository.BrandRepository;
import com.barcontrol.server.service.interfaces.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService implements IBrandService {

    @Autowired
    private BrandRepository brandRepository;


    @Override
    public List<Brand> getBrands() {
        return this.brandRepository.findAll();
    }

    @Override
    public Brand getBrand(Integer id) {

        Brand response = new Brand();

        Optional<Brand> brandFinded = this.brandRepository.findById( id );
        if(brandFinded.isPresent()) {
            response = brandFinded.get();
        }


        return response;
    }

    @Override
    public Brand createBrand(Brand brand) {
        return null;
    }
}
