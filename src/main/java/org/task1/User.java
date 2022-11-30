package org.task1;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;



@SuperBuilder @Getter
@ToString(callSuper=true)
public class User extends Human {
    @Singular
    private List<String> occupations;
}