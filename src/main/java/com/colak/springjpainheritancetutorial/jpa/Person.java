package com.colak.springjpainheritancetutorial.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "people")

@Getter
@Setter
public class Person {

    @EmbeddedId
    private PersonId id;

    @Column(name = "age")
    private int age;

    // Constructors, getters, setters, and other fields/methods

    // Make sure to implement equals and hashCode methods for correct behavior in collections.
}
