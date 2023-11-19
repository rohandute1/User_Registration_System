package com.bridgelabz;
public class UserRegistration {
    public static boolean validateFirstName(String firstName) throws IllegalArgumentException{
        if (firstName.matches("^[A-Z][a-z]{3,}$")){
            return true;
        } else throw new IllegalArgumentException("Invalid first name");
    }
    public static boolean validateLastName(String lastName) throws IllegalArgumentException{
        if (lastName.matches("^[A-Z][a-z]{3,}$")){
            return true;
        } else throw new IllegalArgumentException("Invalid last name");
    }
    public static boolean validateEmailID(String email) throws IllegalArgumentException{
        if (email.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$")){
            return true;
        } else throw new IllegalArgumentException("Invalid email address");
    }
    public static boolean validatePhoneNumber(String number) throws IllegalArgumentException{
        if (number.matches("^91 *[789][0-9]{9}$")){
            return true;
        } else throw new IllegalArgumentException("Invalid phone number");
    }
    public static boolean validatePassword(String password) throws IllegalArgumentException{
        if (password.matches("^(?![.-])[A-Za-z0-9]+(?<!\\.)@[A-Za-z]+(\\.[A-Za-z]+)+$")){
            return true;
        } else throw new IllegalArgumentException("Invalid password");
    }
}
