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
    @Test
    public void testGivenEmailIDValidOrNot(){
        boolean res = UserRegistration.validateEmailID("rohandute1@gmail.com");
        Assertions.assertTrue(res);
    }
    @Test
    public void testGivenPhoneNumberAndReturnValidOrNot(){
        boolean res = UserRegistration.validatePhoneNumber("91 9011824004");
        Assertions.assertTrue(res);
    }
    @Test
    public void testGivenPasswordAndReturnValidOrNot(){
        boolean res = UserRegistration.validatePassword("RohanDute@1");
        Assertions.assertTrue(res);
    }
}
