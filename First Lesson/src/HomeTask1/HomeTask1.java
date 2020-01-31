package HomeTask1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input radius of flower bed");
		double radius=Double.parseDouble(br.readLine());
		double perimeter=2*3.14*radius;
		double area=3.14*radius*radius;
		System.out.println("Perimeter = "+perimeter);
		System.out.println("Area = "+area);
		
	}

}
