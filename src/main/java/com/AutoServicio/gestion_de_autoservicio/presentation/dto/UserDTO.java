package com.AutoServicio.gestion_de_autoservicio.presentation.dto;

import com.AutoServicio.gestion_de_autoservicio.persistence.enums.RoleUser;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long user_id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private RoleUser roleUser;
    private String phoneNumber;
}
