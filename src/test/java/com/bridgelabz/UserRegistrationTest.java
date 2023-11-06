package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    public UserRegistrationTest() {
    }

    @Test
    public void testValidFirstNameWithMinimumLength(){
        boolean res = UserRegistration.validateFirstName("Rohan");
        Assertions.assertTrue(res);
    }
    @ParameterizedTest
    @CsvSource({
            "rohan,false",
            "ro,false",
            "Ro,false"
    })
    public void testInvalidFirstNameWithMinimumLength(String firstName,boolean expected){
        boolean res = UserRegistration.validateFirstName(firstName);
        Assertions.assertEquals(expected,res);
    }
    @Test
    public void testValidLastNameWithMinimumLength(){
        boolean res = UserRegistration.validateLastName("Dute");
        Assertions.assertTrue(res);
    }
    @ParameterizedTest
    @CsvSource({
            "abch,false",
            "psjdbg,false",
    })
    public void testInvalidLastNameWithMinimumLength(String lastName,boolean expected){
        boolean res = UserRegistration.validateLastName(lastName);
        Assertions.assertEquals(expected,res);
    }
    @Test
    public void testGivenEmailIDValidOrNot(){
        boolean res = UserRegistration.validateEmailID("abc@yahoo.com");
        Assertions.assertTrue(res);
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
        boolean res = UserRegistration.validateEmailID(email);
        Assertions.assertEquals(res,expected);
    }
    @ParameterizedTest
    @CsvSource({
            "901158245,false",
            "1234567890,false",
            "925223452852, false"
    })
    public void testGivenPhoneNumberInValid(String number, boolean expected){
        boolean res = UserRegistration.validatePhoneNumber(number);
        Assertions.assertEquals(res, expected);
    }
    @Test
    public void testGivenPasswordAndReturnValidOrNot(){
        boolean res = UserRegistration.validatePassword("RohnDute@1");
        Assertions.assertTrue(res);
    }
    @ParameterizedTest
    @CsvSource({
            "rohan123, false",
            "Rohan@ancv,false",
            "123@Rohan, false"
    })
    public void testInValidPassword(String pass, boolean expected){
        boolean res = UserRegistration.validatePassword(pass);
        Assertions.assertEquals(res, expected);
    }
}
