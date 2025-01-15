package com.AutoServicio.gestion_de_autoservicio.persistence.repository;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<AppointmentEntity, Long> {
}
