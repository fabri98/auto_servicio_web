package com.AutoServicio.gestion_de_autoservicio.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "services")
public class ServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_id;
    private String serviceName;
    private String description;
    private double price;
    private String image_url;

    @Override
    public String toString() {
        return "ServiceEntity{" +
                "service_id=" + service_id +
                ", serviceName='" + serviceName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", image_url='" + image_url + '\'' +
                '}';
    }
}
