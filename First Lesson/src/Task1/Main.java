package Task1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input A");
		int a=Integer.parseInt(br.readLine());
		System.out.println("Input B");
		int b=Integer.parseInt(br.readLine());
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		c=a-b;
		System.out.println(a+"-"+b+"="+c);
		c=a*b;
		System.out.println(a+"*"+b+"="+c);
		c=a/b;
		System.out.println(a+"/"+b+"="+c);
		System.out.println("How are you?");
		
		
	}

}
