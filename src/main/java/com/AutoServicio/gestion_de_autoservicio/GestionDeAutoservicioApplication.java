package com.AutoServicio.gestion_de_autoservicio;

import com.AutoServicio.gestion_de_autoservicio.persistence.entity.AppointmentEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.entity.NewsEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.entity.ServiceEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.entity.UserEntity;
import com.AutoServicio.gestion_de_autoservicio.persistence.enums.RoleUser;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IAppointmentRepository;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.INewsRepository;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IServiceEntityRepository;
import com.AutoServicio.gestion_de_autoservicio.persistence.repository.IUserRepository;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class GestionDeAutoservicioApplication {


    public static void main(String[] args) {
		SpringApplication.run(GestionDeAutoservicioApplication.class, args);
	}


//	private final IUserRepository userRepository;
//	private final INewsRepository newsRepository;
//	private final IServiceEntityRepository serviceEntityRepository;
//	private final IAppointmentRepository appointmentRepository;
//
//
//	public GestionDeAutoservicioApplication(
//			IUserRepository userRepository,
//			INewsRepository newsRepository,
//			IServiceEntityRepository serviceEntityRepository,
//			IAppointmentRepository appointmentRepository
//			) {
//		this.userRepository = userRepository;
//		this.newsRepository = newsRepository;
//		this.serviceEntityRepository = serviceEntityRepository;
//		this.appointmentRepository = appointmentRepository;
//	}
//
//	@Bean
//	public CommandLineRunner init(){
//		return args -> {
//			UserEntity user1 = UserEntity.builder()
//					.firstName("Fabrizio")
//					.lastName("Armoa")
//					.email("fabri111298@gmail.com")
//					.password(new BCryptPasswordEncoder().encode("1234"))
//					.phone_number("3731445002")
//					.roleUser(RoleUser.EMPLOYEE)
//					.build();
//
//
//			NewsEntity new1 = NewsEntity.builder()
//					.title("Promo Chapa y pintura!")
//					.content("mucho texto.....")
//					.user(user1)
//					.published_at(new Date())
//					.image_url("/uploads/img/pintura.jpg")
//					.build();
//
//			ServiceEntity service1 = ServiceEntity.builder()
//					.serviceName("Chapa y Pintura")
//					.description("Reparación de la chapa y pintura personalizada")
//					.price(25000.00)
//					.image_url("/uploads/img/chapa.jpg")
//					.build();
//
//			AppointmentEntity appointment1 = AppointmentEntity.builder()
//					.appointment_date(LocalDate.now())
//					.user(user1)
//					.service(service1)
//					.appointment_hour(LocalTime.now())
//					.build();
//
//			// newsRepository.save(new1);
//			appointmentRepository.save(appointment1);
//		};

}
