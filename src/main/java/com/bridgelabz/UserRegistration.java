package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    final static String regex = "^[A-Z]{1}[a-z]{3,}$";
    final static String regexID = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$";
    final static String regexNumber = "^91 *[789]{1}[0-9]{9}$";
    final static String regexPassword = "^[A-Z]{1,}([a-zA-Z]{6,}[@#$&]{1}[0-9]{1,})$";

    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(firstName);
        return match.matches();
    }
    public static boolean validateLastName(String lastName){
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(lastName);
        return match.matches();
    }
    public static boolean validateEmailID(String email){
        Pattern pattern = Pattern.compile(regexID);
        Matcher match = pattern.matcher(email);
        return match.matches();
    }
    public static boolean validatePhoneNumber(String number){
        Pattern pattern = Pattern.compile(regexNumber);
        Matcher match = pattern.matcher(number);
        return match.matches();
    }

    public static boolean validatePassword(String pass) {
        Pattern pattern = Pattern.compile(regexPassword);
        Matcher match  = pattern.matcher(pass);
        return match.matches();
    }
}
