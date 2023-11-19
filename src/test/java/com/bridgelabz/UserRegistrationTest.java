package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {

    public static class CustomTestFailureException extends RuntimeException {
        public CustomTestFailureException(String message) {
            super(message);
        }
    }
    public UserRegistrationTest() {
    }
    @Test
    public void testValidFirstNameWithMinimumLength(){
        try {
            boolean result = UserRegistration.userFirstName.detailsValidator("Rohan");
            Assertions.assertTrue(result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e) {
            // Assertion failed, throw a custom exception
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "rohan,false",
            "ro,false",
            "Ro,false"
    })
    public void testInvalidFirstNameWithMinimumLength(String firstName,boolean expected){
        try{
            boolean result = UserRegistration.userFirstName.detailsValidator(firstName);
            Assertions.assertEquals(expected,result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @Test
    public void testValidLastNameWithMinimumLength(){
        try {
            boolean result = UserRegistration.userLastName.detailsValidator("Abcde");
            Assertions.assertTrue(result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e) {
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "ch,false",
            "psjdbg,false",
    })
    public void testInvalidLastNameWithMinimumLength(String lastName,boolean expected){
        try{
            boolean result = UserRegistration.userLastName.detailsValidator(lastName);
            Assertions.assertEquals(expected,result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @Test
    public void testGivenEmailIDValidOrNot(){
        try{
            boolean result = UserRegistration.userEmailID.detailsValidator("abc@yahoo.com");
            Assertions.assertTrue(result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "abc,false",
            "abc@.com.my,true",
            "abc123@gmail.a,false",
            "abc123@.com, false",
            "abc123@.com.com, true",
            ".abc@abc.com, true",
            "abc()*@gmail.com, false",
            "abc@%*.com, false",
            "abc..2002@gmail.com, true",
            "abc.@gmail.com, true",
            "abc@abc@gmail.com, false",
            "abc@gmail.com.1a, false",
            "abc@gmail.com.aa.au, true"
    })
    public void testGivenInValidEmails(String email, boolean expected){
        try {
            boolean result = UserRegistration.userEmailID.detailsValidator(email);
            Assertions.assertEquals(result,expected, "Expected the validation to pass, but it failed.");
        }catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "901158245,false",
            "1234567890,false",
            "925223452852, false"
    })
    public void testGivenPhoneNumberInValid(String number, boolean expected){
        try {
            boolean result = UserRegistration.userPhoneNumber.detailsValidator(number);
            Assertions.assertEquals(result, expected, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @Test
    public void testGivenPasswordAndReturnValidOrNot(){
        try {
            boolean result = UserRegistration.userPassword.detailsValidator("Passw1rd!");
            Assertions.assertTrue(result, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "password, false",
            "12345678v,false",
            "Abcd12, false"
    })
    public void testInValidPassword(String password, boolean expected){
        try {
            boolean result = UserRegistration.userPassword.detailsValidator(password);
            Assertions.assertEquals(result, expected, "Expected the validation to pass, but it failed.");
        } catch (AssertionError e){
            throw new CustomTestFailureException("Custom exception: " + e.getMessage());
        }
    }
}
