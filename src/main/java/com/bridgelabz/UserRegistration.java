package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationValidator{
    boolean detailsValidator(String userDetails)throws IllegalArgumentException;
}
public class UserRegistration {
    UserRegistrationValidator userFirstName = firstName -> Pattern.compile("^[A-Z][a-z]{3,}$").matcher(firstName).matches();

    UserRegistrationValidator userLastName = firstName -> Pattern.compile("^[A-Z][a-z]{3,}$").matcher(firstName).matches();

    UserRegistrationValidator userEmailID = firstName -> Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$").matcher(firstName).matches();

    UserRegistrationValidator userPhoneNumber = firstName -> Pattern.compile("^91 *[789][0-9]{9}$").matcher(firstName).matches();

    UserRegistrationValidator userPassword = firstName -> Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=]).{8,}$").matcher(firstName).matches();
}
