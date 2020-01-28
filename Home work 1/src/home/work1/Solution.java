package home.work1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a = ");
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("b = ");
		int b = Integer.parseInt(br.readLine());
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		if ( b != 0)
		System.out.println("a / b = " + (a / b));
		else System.out.println("Error");
		
		System.out.println("How are you?");
		String answer = br.readLine();
		System.out.println("You are " + answer);
		
		
	}

}
