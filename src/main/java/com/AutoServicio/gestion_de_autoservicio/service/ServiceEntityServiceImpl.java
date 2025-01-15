package com.AutoServicio.gestion_de_autoservicio.service;

import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IServiceEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceEntityServiceImpl {

    private final IServiceEntityRepository serviceEntityRepository;

    public ServiceEntityServiceImpl(IServiceEntityRepository serviceEntityRepository) {
        this.serviceEntityRepository = serviceEntityRepository;
    }
}
