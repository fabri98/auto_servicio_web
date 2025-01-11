package com.AutoServicio.gestion_de_autoservicio.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "appointments")
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointment_id;
    private LocalDate appointment_date;
    private LocalTime appointment_hour;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(
            name = "user_id",
            referencedColumnName = "user_id"
    )
    private UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(
            name = "service_id",
            referencedColumnName = "service_id"
    )
    private ServiceEntity service;

    @Override
    public String toString() {
        return "AppointmentEntity{" +
                "appointment_id=" + appointment_id +
                ", appointment_date=" + appointment_date +
                ", appointment_hour=" + appointment_hour +
                ", user=" + user +
                ", service=" + service +
                '}';
    }
}
