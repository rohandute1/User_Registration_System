package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    final static String regex = "^[A-Z]{1}[a-z]{3,}$";

    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(firstName);
        return match.matches();
    }
}
