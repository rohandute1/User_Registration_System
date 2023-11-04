package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    public UserRegistrationTest() {
    }

    @Test
    public void testValidFirstNameWithMinimumLength(){
        boolean res = UserRegistration.validateFirstName("Rohan");
        Assertions.assertTrue(res);
    }
    @Test
    public void testValidLastNameWithMinimumLength(){
        boolean res = UserRegistration.validateLastName("Dute");
        Assertions.assertTrue(res);
    }
}
