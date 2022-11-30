package org.task1;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Test").age(22).occupation("UCU").gender(Gender.MALE).weight(80).height(180).build();
        System.out.println(user);
    }
}
