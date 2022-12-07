package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentRepository repository){
		 return  ( (args -> {
			 repository.save(new Student("Gashaw", "Dargie", 37, "male"));
			 repository.save(new Student("Solomon", "Kebede", 36, "male"));
			 repository.save(new Student("Molla", "wedajo", 38, "male"));
			 repository.save(new Student("Selamwit", "Kebede", 23, "female"));
			 repository.save(new Student("Mery", "Kassa", 19, "female"));
			 repository.save(new Student("Solomon", "Kebede", 36, "male"));
			 repository.save(new Student("Kidist", "Belay", 28, "female"));
			 repository.save(new Student("Aregawi", "Dejen", 31, "male"));
			 repository.save(new Student("Solomon", "Kebede", 36, "male"));
			 repository.save(new Student("Teshemo", "Abebe", 39, "male"));
			 repository.save(new Student("Mengesha", "Taye", 29, "male"));
			 repository.save(new Student("Selam", "Tesfaye", 19, "female"));
			 repository.save(new Student("Solomon", "Dargie", 40, "male"));
		 }) );
	}

}
