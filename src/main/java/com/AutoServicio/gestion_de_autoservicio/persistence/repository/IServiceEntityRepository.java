package com.AutoServicio.gestion_de_autoservicio.persistence.repository;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IServiceEntityRepository extends JpaRepository<ServiceEntity, Long> {
}
