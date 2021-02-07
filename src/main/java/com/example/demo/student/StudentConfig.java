package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student janek = new Student(
                    "Janek",
                    "janek.kowalski@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student Ania = new Student(
                    "Ania",
                    "ania@gmail.com",
                    LocalDate.of(1990, Month.DECEMBER, 15)
            );

            repository.saveAll(List.of(janek, Ania));
        };
    }
}
