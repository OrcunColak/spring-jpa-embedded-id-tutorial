package com.colak.springjpainheritancetutorial.repository;

import com.colak.springjpainheritancetutorial.jpa.Person;
import com.colak.springjpainheritancetutorial.jpa.PersonId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository repository;

    @Test
    void findById() {

        // select ... from people p where (p.first_name,p.last_name) in ((?,?))
        PersonId personId = new PersonId("John", "Doe");
        Optional<Person> optional = repository.findById(personId);
        assertThat(optional).isNotEmpty();
        assertThat(optional.get().getId().getFirstName()).isEqualTo("John");
    }
}
