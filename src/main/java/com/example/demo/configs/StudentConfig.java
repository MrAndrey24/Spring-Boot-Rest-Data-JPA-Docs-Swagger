package com.example.demo.configs;

import com.example.demo.repositories.StudentRepository;
import com.example.demo.entities.student.Student;
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
            Student andrey = new Student(
                    "Andrey",
                    "andrey@gmail.com",
                    LocalDate.of(2003, Month.JULY, 24)

            );
            Student carlos = new Student(
                    "Carlos",
                    "carlos@gmail.com",
                    LocalDate.of(2001, Month.DECEMBER, 18)

            );
            Student nazira = new Student(
                    "Nazira",
                    "nazira@gmail.com",
                    LocalDate.of(1980, Month.NOVEMBER,3)
            );

            repository.saveAll(
                    List.of(andrey, carlos, nazira)
            );
        };
    }
}
