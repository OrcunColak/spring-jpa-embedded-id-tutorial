package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.embeddableidasercord.Student;
import com.colak.springtutorial.jpa.embeddableidasercord.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, StudentId> {
}
