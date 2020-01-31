package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How are you?");
		String s=br.readLine();
		System.out.println("You are "+s);
	}

}
