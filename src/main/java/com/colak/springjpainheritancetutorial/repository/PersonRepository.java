package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Person;
import com.colak.springjpainheritancetutorial.jpa.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
}
