package com.softserve.edu.oopHomeworkTask1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		Bird[] arrayOfBirds=new Bird[9];
		arrayOfBirds[0]=new Kiwi("Kiwi1",true,true);
		arrayOfBirds[1]=new Kiwi("Kiwi2",true,true);
		arrayOfBirds[2]=new Eagle("Eagle1",true,false);
		arrayOfBirds[3]=new Kiwi("Swallow1",true,false);
		arrayOfBirds[4]=new Kiwi("Penguin1",false,true);
		arrayOfBirds[5]=new Kiwi("Swallow2",true,false);
		arrayOfBirds[6]=new Kiwi("Kiwi3",true,true);
		arrayOfBirds[7]=new Kiwi("Penguin2",false,true);
		arrayOfBirds[8]=new Eagle("Eagle2",true,false);
		
		
		for(Bird bird:arrayOfBirds) {
			System.out.println(bird.toString());
		}
	}

}
