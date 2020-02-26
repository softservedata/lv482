package Exception;

/**
 * Practical Task 1
 * @author Kristinafedina
 */

import java.util.Scanner;

public class Rectangle extends Figure {

	public static void main(String[] args) {
		
		double a = 0;
		double b = 0;
		System.out.println("Enter a ");
		System.out.println("Enter b ");
		
		try(Scanner sc = new Scanner(System.in);){
			a = Double.parseDouble(sc.nextLine());
			b = Double.parseDouble(sc.nextLine());
		}catch( NumberFormatException e) {
			System.err.println("Incorrect format.");
			System.exit(1);
		}catch( Exception e) {
			System.err.println(" Something went wrong.");
		}
		Figure f = new Rectangle(a, b);
		
		try {
			System.out.println("The area is " + f.getArea());
		} catch (NegativeValueException e) {
			System.err.println("Enter just positive numbers");
			e.printStackTrace();
		} catch (NullValueException  e) {
			System.err.println("Parametrs can't be 0");
			e.printStackTrace();
		}catch( Exception e) {
			System.err.println(" Something went wrong.");
		}
		
		
	}

	private double a;
	private double b;


	@Override
	public double getArea() throws NullValueException, NegativeValueException {
		double area = a * b;
		if ((a < 0) || (b < 0)){
			throw new  NegativeValueException();
		}
		if (area == 0) {
			throw new  NullValueException("Figure with area = 0 doesn't exist");
		}
	
		return area;
	}

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(a);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(b);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
			return false;
		if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
			return false;
		return true;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
