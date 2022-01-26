package com.jorfermo.studentmicroservice.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student john = new Student(1L, "John Doe", LocalDate.of(1990, Month.JANUARY, 1), "john@doe.com");
            Student jane = new Student(2L, "Jane Doe", LocalDate.of(1995, Month.JANUARY, 1), "jane@doe.com");
            repository.saveAll(List.of(john, jane));
        };
    };
}
