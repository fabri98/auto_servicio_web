package com.AutoServicio.gestion_de_autoservicio;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.NewsEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.entity.UserEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.enums.RoleUser;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.INewsRepository;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class GestionDeAutoservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionDeAutoservicioApplication.class, args);
	}


	@Bean
	public CommandLineRunner init(IUserRepository userRepository, INewsRepository newsRepository){
		return args -> {
			UserEntity user1 = UserEntity.builder()
					.firstName("Fabrizio")
					.lastName("Armoa")
					.email("fabri111298@gmail.com")
					.password(new BCryptPasswordEncoder().encode("1234"))
					.phone_number("3731445002")
					.roleUser(RoleUser.EMPLOYEE)
					.build();


			NewsEntity new1 = NewsEntity.builder()
					.title("Promo Chapa y pintura!")
					.content("mucho texto.....")
					.user(user1)
					.published_at(new Date())
					.image_url("/uploads/img/pintura.jpg")
					.build();

			newsRepository.save(new1);
		};
	}
}
