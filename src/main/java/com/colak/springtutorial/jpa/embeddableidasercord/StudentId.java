package com.colak.springtutorial.jpa.embeddableidasercord;

import jakarta.persistence.Embeddable;

// Unlike @IdClass, the order of attributes do not need to be in alphabetical order
@Embeddable
public record StudentId(String name, Integer age, String address) {
}
