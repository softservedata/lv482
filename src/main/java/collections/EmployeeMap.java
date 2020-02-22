package collections;

/*
 * Collections. Generic 
 * Practical Task 2
 */

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMap {

	public static void main(String[] args) {
		
		Map<Integer, String> employeeMap = new TreeMap<>();
		
		employeeMap.put(12, "Ola");
		employeeMap.put(23, "Ira");
		employeeMap.put(32, "Taras");
		employeeMap.put(13, "Ivan");
		employeeMap.put(42, "Yula");
		employeeMap.put(33, "Yra");
		employeeMap.put(18, "Jone");
		
		System.out.println("employeeMap = " + employeeMap);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID" );
		try{
			int ID = Integer.parseInt(sc.nextLine());
		
		int count = 0;
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getKey() == ID) {
				System.out.println("User name is " + entry.getValue() + " ID " + entry.getKey());
			}
			else {
				count++;
			}
		}
		if(employeeMap.size() == count) {
			System.out.println("That user doesn't exist");
		}
		 }
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		
		
		
		System.out.println("Enter Name" );
		try{
			String name = sc.nextLine();
		
		int countName = 0;
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			if (entry.getValue().toLowerCase().equals(name)) {
				System.out.println("User name is " + entry.getValue() + " ID " + entry.getKey());
			}
			else {
				countName++;
			}
		}
		
		if(employeeMap.size() == countName) {
			System.out.println("That name doesn't exist");
		}
	  }
	catch(Exception e) {
		System.out.println("Something went wrong!");
	}
	}

}
