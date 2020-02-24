package stringRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Practical Task 1
 * 
 * Enter the two variables of type String. Determine whether the first 
 * variable substring second. For example, if you typed «IT» and «IT Academy» you must receive true.

 */

public class PracticalTask {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String ex = " ";
		String subEx = " ";
		System.out.println("Enter string");
		System.out.println("Enter substring");
		try {
			ex = br.readLine();
			subEx = br.readLine();
		} catch (IOException e) {
			System.err.println("Something went wrong!");
		}
		boolean check1 = ex.startsWith(subEx);
		System.out.println(check1);

		/*
		 * Practical Task 2
		 * 
		 * Enter surname, name and patronymic on the console as a variable of type
		 * String. Output on the console: surnames and initials name name, middle name
		 * and last name
		 * 
		 */

		String snp = " ";

		System.out.println("Enter surname, name and patronymic");

		try {
			snp = br.readLine();

		} catch (IOException e) {
			System.err.println("Something went wrong!");
		}

		List<String> arrCheck = new ArrayList<>();
		Pattern p1 = Pattern.compile("[^A-Za-z -]+");
		Matcher m1 = p1.matcher(snp);
		while (m1.find()) {
			arrCheck.add(snp.substring(m1.start(), m1.end()));

		}
		// System.out.println(arrCheck);
		if (arrCheck.size() > 0) {
			System.out.println("There is uncorrect format.");
		} else {
			List<String> arr = new ArrayList<>();
			Pattern p = Pattern.compile("[A-Za-z-]+");
			Matcher m = p.matcher(snp);
			while (m.find()) {
				arr.add(snp.substring(m.start(), m.end()));
			}
			if (arr.size() > 3) {
				System.out.println("Do you have Doble name or surname? If yes, use - ");
			}
			// System.out.println(arr);
			try {
				System.out
						.println("Surname " + arr.get(0) + " initials " + arr.get(1).charAt(0) + arr.get(2).charAt(0));

				System.out.println("Name = " + arr.get(1));

				System.out.println(
						"Name = " + arr.get(1) + " middle name = " + arr.get(2) + " last name = " + arr.get(0));
			} catch (IndexOutOfBoundsException e) {
				System.err.println("Thrre is IndexOutOfBoundsException");

			}
		}

		/*
		 * Practical Task 3
		 * 
		 * The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
		 * underscores. Using regular expressions implement checking the user name for
		 * validity. Input five names in the main method . Output a message to the
		 * console of the validation of each of the entered names.
		 * 
		 */

		System.out.println("Enter your login ");
		String login = " ";
		try {
			login = br.readLine().trim();

		} catch (IOException e) {
			System.err.println("Something went wrong!");
		}
		if (login.length() > 2 && login.length() < 16) {

			Pattern p2 = Pattern.compile("[A-Za-z0-9_]{3,15}");
			Matcher m2 = p2.matcher(login);
			String check = " ";
			while (m2.find()) {
				check = login.substring(m2.start(), m2.end());
			}
			if (check.equals(login)) {
				System.out.println("There is correct login");
			} else {
				System.err.println("There is uncorrect login");
			}

		} else {
			System.err.println("The login length must be 3-15 characters");
		}
	}
}
