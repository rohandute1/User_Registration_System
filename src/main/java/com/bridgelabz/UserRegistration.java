package com.bridgelabz;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegistrationValidator{
    boolean detailsValidator(String userDetails)throws IllegalArgumentException;
}
public class UserRegistration {
    UserRegistrationValidator userFirstName = firstName -> Pattern.compile("^[A-Z][a-z]{3,}$").matcher(firstName).matches();

    UserRegistrationValidator userLastName = lastName -> Pattern.compile("^[A-Z][a-z]{3,}$").matcher(lastName).matches();

    UserRegistrationValidator userEmailID = emailAddress -> Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$").matcher(emailAddress).matches();

    UserRegistrationValidator userPhoneNumber = phoneNumber -> Pattern.compile("^91 *[789][0-9]{9}$").matcher(phoneNumber).matches();

    UserRegistrationValidator userPassword = password -> Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()-_+=]).{8,}$").matcher(password).matches();
}
