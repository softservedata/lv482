package com.softserve.educonditionalStatements;

import java.util.Scanner;

public enum HTTP_Error {
	BAD_REGUEST(400), UNAVTORISED(401), PAYMENT_REGUIRED(402), FORBIDDEN(403), NOT_FOUND(404);
	
	public int getNumberOfError() {
		return NumberOfError;
	}

	public void setNumberOfError(int numberOfError) {
		NumberOfError = numberOfError;
	}

	private HTTP_Error(int numberOfError) {
		NumberOfError = numberOfError;
	}

	private int NumberOfError;

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of error ");
		HTTP_Error[] err = {BAD_REGUEST, UNAVTORISED, PAYMENT_REGUIRED, 
				FORBIDDEN, NOT_FOUND};
		
		
		try {int count = 0;
			int error = Integer.parseInt(sc.nextLine());
			for(int k = 0; k < err.length; k++) {
				if(error == err[k].getNumberOfError()) {
					System.out.println(err[k]);
					count++;
					}
			
			}
			if(count < 1) System.out.println("There isn't correct number");
		
		}
		catch(Exception e) {
			
			System.out.println("Enter corect value!");
		}
	}

}
	
