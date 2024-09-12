package com.colak.springtutorial.jpa.embeddableidasercord;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;

@Entity
@Getter
public class Student {

    @EmbeddedId
    private StudentId studentId;

    private String school;
}
