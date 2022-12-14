package org.task1;

import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

enum Gender {
    MALE, FEMALE
}

@SuperBuilder
@ToString @Getter
public class Human {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}
