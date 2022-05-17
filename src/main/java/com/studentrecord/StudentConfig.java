package com.studentrecord;

import com.studentrecord.dao.StudentRepository;
import com.studentrecord.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Jay = new Student(
                    "Jay",
                    LocalDate.of(2000, JANUARY, 5),
                    "jay@gmail.com"
            );

            Student Amir = new Student(
                    "Amir",
                    LocalDate.of(2001, FEBRUARY, 2),
                    "amir@gmail.com"
            );
            repository.saveAll(
                    List.of(Jay, Amir)
            );
        };
    }
}
