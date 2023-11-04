package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void testValidFirstNameWithMinimumLength(){
        userRegistration.validateFirstName();
        String result = userRegistration.validateFirstName();
        Assertions.assertEquals("Welcome to User Registration System",result);
    }
}
