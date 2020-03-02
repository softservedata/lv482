package thread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Practical Task 3
 * @author Kristina
 *
 */

public class MyTxt {

	public static void main(String[] args)  {
		
		List <String> list = new ArrayList<>();
		int count = 0;
		String s = "";
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\My Project\\lv482\\src\\main\\java\\thread\\Birds.txt"))) {
			while ((s = br.readLine()) != null) {
				list.add(s);
				count++;
				System.out.printf("\nLine " + count + " length  = " + s.length() );
			}
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		String max = list.get(0);
		String min = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if(max.length() < list.get(i).length()) {
				max = list.get(i);
			}
			if(min.length() > list.get(i).length()) {
				min = list.get(i);
			}
		}
		System.out.println("\nMaximum is: " + max);
		System.out.println("Minimum is: " + min);
		
		for(String current : list) {
			if(current.contains("birds")) {
				System.out.println(current);
			}
		}
		}

	}


