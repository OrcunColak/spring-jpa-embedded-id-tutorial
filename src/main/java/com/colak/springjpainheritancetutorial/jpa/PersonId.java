package com.colak.springjpainheritancetutorial.jpa;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PersonId implements Serializable {

    private String firstName;
    private String lastName;

    // Constructors, getters, setters, and equals/hashCode methods

    // Make sure to implement equals and hashCode methods
    // to ensure correct behavior in collections
    // (e.g., when using a Set<Person> or Map<Person, ...>).

    // Also, consider implementing Serializable for proper handling in different contexts.
}
