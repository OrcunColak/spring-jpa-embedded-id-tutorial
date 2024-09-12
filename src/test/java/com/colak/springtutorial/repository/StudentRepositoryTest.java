package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.embeddableidasercord.Student;
import com.colak.springtutorial.jpa.embeddableidasercord.StudentId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    void findById() {
        StudentId studentId = new StudentId("John Doe", 16, "123 Maple Street");
        Optional<Student> optional = repository.findById(studentId);
        assertThat(optional)
                .isPresent();

        Student student = optional.get();
        assertThat(student.getStudentId().name())
                .isEqualTo("John Doe");

    }

}