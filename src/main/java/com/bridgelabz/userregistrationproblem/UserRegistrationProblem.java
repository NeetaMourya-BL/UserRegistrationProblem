package com.bridgelabz.userregistrationproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {
	/*
	 * First name starts with Cap and has minimum 3 characters
	 */
	public static boolean isValidUserFirstName(String firstname) {
		// Regex to check valid userfirstname.
		String regex = "^[A-Za-z]\\w{3,29}$";
		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		// If the userfirstname is empty
		// return false
		if (firstname == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given userfirstname
		// and regular expression.
		Matcher m = p.matcher(firstname);
		// Return if the userfirstname
		// matched the ReGex
		return m.matches();
	}

	public static void main(String[] args) {
		String firstName = "Neeta"; // firstname
		System.out.println(isValidUserFirstName(firstName));
	}

}
