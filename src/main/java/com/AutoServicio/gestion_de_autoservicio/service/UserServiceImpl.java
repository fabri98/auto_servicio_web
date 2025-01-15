package com.AutoServicio.gestion_de_autoservicio.service;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.UserEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IUserRepository;
import com.AutoServicio.gestion_de_autoservicio.presentation.dto.UserDTO;
import com.AutoServicio.gestion_de_autoservicio.service.interfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String create(UserDTO userDTO){
        try{
            ModelMapper userMapper = new ModelMapper();
            UserEntity userEntity = userMapper.map(userDTO, UserEntity.class);
            userEntity.setPassword(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
            userRepository.save(userEntity);

            return "User Created!";
        }catch (Exception e){
            throw new UnsupportedOperationException("Error al guardar el usuario");
        }
    }
}
