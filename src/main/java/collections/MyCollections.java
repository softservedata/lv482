package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Collections. Generic 
 * Practical Task 1
 */


public class MyCollections {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n = Integer.parseInt(sc.nextLine());
		
		List<Integer> myCollections  = new ArrayList<Integer>();
		Random rd = new Random();
		
		 for(int i = 0; i < n; i++) {
			 myCollections.add( rd.nextInt(30));
			
		 }
		 System.out.println("MyCollections = " + myCollections);
		 
		 List<Integer> newCollections  = new ArrayList<Integer>();
		 for(Integer current : myCollections ) {
			 if(current > 5) {
				 newCollections.add(current);
			 }
		 }
		 System.out.println("NewCollections = " + newCollections  );
		 
		 Iterator<Integer> iterator = myCollections.iterator();
	
		 while(iterator.hasNext()) {
			int i = iterator.next();
			if(i >= 20) {	 
				iterator.remove();
			 }
		 }
		 System.out.println("MyCollections after removing = " + myCollections);
		
		
		if(2 < myCollections.size() ) {
			myCollections.add(2,1);
		}
		else {
			myCollections.add(myCollections.size(),1);
		}
		
		if(8 < myCollections.size() ) {
			myCollections.add(8,-3);
		}
		else {
			myCollections.add(myCollections.size(),-3);
		}
		
		if(5 < myCollections.size() ) {
			myCollections.add(5,-4);
		}
		else {
			myCollections.add(myCollections.size(),-3);
		}
		
		 System.out.println("MyCollections changed = " + myCollections);
		 
		 Collections.sort( myCollections);
		 System.out.println("MyCollections sorted = " + myCollections);
}
}