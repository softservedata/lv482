package Exception;

import java.util.Scanner;

/**
 * Homework Task 1
 * 
 * @author Kristina
 *
 */

public class Division {

	public static void main(String[] args) {

		System.out.println("Enter a");
		System.out.println("Enter b");

		double a = 0;
		double b = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
			Division d = new Division(a,b);
			System.out.println(d.div());
		} catch (NumberFormatException e) {
			System.err.println("Incorrect format.");
		 } catch (NullValueException e) {
			System.err.println("Division permitted.");
		 }catch (Exception e) {
			System.err.println(" Something went wrong.");
			System.exit(1);
		}
	}

	public double a;
	public double b;

	public double div() throws NullValueException {
		if (b == 0) {
			throw new NullValueException("Division to 0 is permitted");
		}
		double division = a / b;
		return division;

	}

	public Division(double a, double b) {
		this.a = a;
		this.b = b;
	}
}
