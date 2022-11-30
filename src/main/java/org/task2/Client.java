package org.task2;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

enum Gender {
    MALE, FEMALE
}

@Getter @ToString
public class Client {
    private final int id;
    private final String name;
    private final int age;
    private final Gender sex;

    private final String email;

    private static int idCounter = 0;

    public Client(String name, int age, Gender sex, String email) {
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
