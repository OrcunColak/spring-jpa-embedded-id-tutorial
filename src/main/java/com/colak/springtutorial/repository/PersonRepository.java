package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.embeddableidasclass.Person;
import com.colak.springtutorial.jpa.embeddableidasclass.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, PersonId> {
}
