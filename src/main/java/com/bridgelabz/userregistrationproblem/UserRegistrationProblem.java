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

	/*
	 * Name - Last name starts with Cap and has minimum 3 character
	 */
	public static boolean isValidUserLastName(String lastName) {
		// Regex to check valid userlastName.
		String regex = "^[A-Za-z]\\w{3,29}$";
		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		// If the userlastName is empty
		// return false
		if (lastName == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given userlastName
		// and regular expression.
		Matcher m = p.matcher(lastName);
		// Return if the userlastName
		// matched the ReGex
		return m.matches();
	}

	/*
	 * As a User need to enter a valid email
	 */
	public static boolean isValidUserEmail(String userEmail) {
		// Regex to check valid useremail.
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		// Compile the ReGex
		Pattern p = Pattern.compile(regex);

		// If the useremail is empty
		// return false
		if (userEmail == null) {
			return false;
		}
		// Pattern class contains matcher() method
		// to find matching between given useremail
		// and regular expression.
		Matcher m = p.matcher(userEmail);
		// Return if the useremail
		// matched the ReGex
		return m.matches();
	}

	/*
	 * As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801 -
	 * Country code follow by space and 10 digit number
	 */
	public static boolean isValidUserMobileNumber(String userMobileNumnber) {
		Pattern ptrn = Pattern.compile("^(\\+?\\d{1,4}[\\s-])?(?!0+\\s+,?$)\\d{10}\\s*,?$");
		// the matcher() method creates a matcher that will match the given input
		// against this pattern
		Matcher match = ptrn.matcher(userMobileNumnber);
		// returns a boolean value
		return match.matches();
	}

	public static void main(String[] args) {
		String firstName = "Neeta"; // firstname
		System.out.println(isValidUserFirstName(firstName));

		String lastName = "Mourya"; // lastName
		System.out.println(isValidUserLastName(lastName));

		String userEmail = "abc.xyz@bl.co.in"; // userEmail
		System.out.println(isValidUserEmail(userEmail));

		String userMobileNumnber = "91 9919819801"; // userMobileNumnber
		System.out.println(isValidUserMobileNumber(userMobileNumnber));
	}

}
