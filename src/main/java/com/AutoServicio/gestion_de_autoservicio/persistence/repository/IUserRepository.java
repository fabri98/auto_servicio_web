package com.AutoServicio.gestion_de_autoservicio.persistence.repository;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findUserEntityByEmail(String email);
}
