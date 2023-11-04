package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    final static String regex = "^[A-Z]{1}[a-z]{3,}$";
    final static String regexID = "^[a-zA-Z0-9]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+([.][a-z]+)+([.][a-z])*)$";
    final static String regexNumber = "^91 *[789]{1}[0-9]{9}$";

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
}
