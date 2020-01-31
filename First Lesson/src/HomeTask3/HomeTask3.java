package HomeTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input C1");
		double c1=Double.parseDouble(br.readLine());
		System.out.println("Input T1");
		double t1=Double.parseDouble(br.readLine());
		System.out.println("Input C2");
		double c2=Double.parseDouble(br.readLine());
		System.out.println("Input T2");
		double t2=Double.parseDouble(br.readLine());
		System.out.println("Input C3");
		double c3=Double.parseDouble(br.readLine());
		System.out.println("Input T3");
		double t3=Double.parseDouble(br.readLine());
		
		System.out.println("Price in first country will = "+c1*t1);
		System.out.println("Price in second country will = "+c2*t2);
		System.out.println("Price in third country will = "+c3*t3);
		double sum= c1*t1+c2*t2+c3*t3;
		System.out.println("Price of all talk together will = "+sum);
		
	}

}
