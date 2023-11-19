package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {

    public UserRegistrationTest() {
    }

    @Test
    public void testValidFirstNameWithMinimumLength(){
        try {
            boolean res = UserRegistration.validateFirstName("Rohan");
            Assertions.assertTrue(res);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
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
            boolean res = UserRegistration.validateFirstName(firstName);
            Assertions.assertEquals(expected,res);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
        }
    }
    @Test
    public void testValidLastNameWithMinimumLength(){
        try {
            boolean res = UserRegistration.validateLastName("Dute");
            Assertions.assertTrue(res);
        } catch (IllegalArgumentException e) {
            System.out.println("Unexpected exception: " + e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvSource({
            "abch,false",
            "psjdbg,false",
    })
    public void testInvalidLastNameWithMinimumLength(String lastName,boolean expected){
        try{
            boolean res = UserRegistration.validateLastName(lastName);
            Assertions.assertEquals(expected,res);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
        }

    }
    @Test
    public void testGivenEmailIDValidOrNot(){
        try{
            boolean res = UserRegistration.validateEmailID("abc@yahoo.com");
            Assertions.assertTrue(res);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
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
            boolean res = UserRegistration.validateEmailID(email);
            Assertions.assertEquals(res,expected);
        }catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
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
            boolean res = UserRegistration.validatePhoneNumber(number);
            Assertions.assertEquals(res, expected);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
        }

    }
    @Test
    public void testGivenPasswordAndReturnValidOrNot(){
        try {
            boolean res = UserRegistration.validatePassword("RohnDute@1");
            Assertions.assertTrue(res);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
        }

    }
    @ParameterizedTest
    @CsvSource({
            "rohan123, false",
            "Rohan@ancv,false",
            "123@Rohan, false"
    })
    public void testInValidPassword(String pass, boolean expected){
        try {
            boolean res = UserRegistration.validatePassword(pass);
            Assertions.assertEquals(res, expected);
        } catch (IllegalArgumentException e){
            System.out.println("Unexpected exception: " + e.getMessage());
        }

    }
}
