package org.task1;

import junit.framework.TestCase;

public class UserTest extends TestCase {
    public void testBuilder() {
        User user = User.builder().name("Test").age(22).occupation("UCU").gender(Gender.MALE).weight(80).height(180).build();
        assertEquals("Test", user.getName());
        assertEquals(22, user.getAge());
        assertEquals("UCU", user.getOccupations().get(0));
        assertEquals(80.0, user.getWeight());
        assertEquals(180.0, user.getHeight());
    }
}