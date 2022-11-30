package org.task1;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;



@SuperBuilder
@ToString(callSuper=true)
public class User extends Human {
    @Singular
    private List<String> occupations;
}