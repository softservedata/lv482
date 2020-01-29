package com.softserve.edu.lv482;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import com.softserve.edu.t2.Student;

class My {
	int a;

	//
	My(int i) {
	}

	My() {
	}

	//
	void prnt() {
		int i = 10;
		System.out.println("i=" + i);
		double d = i;
		d = d + 0.1;
		System.out.println("d=" + d);
		int k = (int) d;  // Code Smell
		System.out.println("k=" + k);
	}
}

public class Appl {
	public static void main(String[] args) throws IOException {
		//Student st = new Student();
		// st.lastName = "11";
		//My my = new My();
		//System.out.println("my.a = " + my.a);
		//my.prnt();
		//
		/*
		Person p = new Person();
		p.name = "Ivan";
		p.print("info ");
		p.print("111", "222", "333");
		//System.out.println("Person.class = " + Person.class.toString());
		//System.out.println("Person.class = " + p.getClass());
		*/
		//
		/*
		Student st = new Student("Petro");
		st.setName("Ivan");
		st.readName();
		System.out.println(st.getName());
		*/
		//
		/*
		By b1=new By();
		By b2=new By();
		By b3=new By();
		//By.count = 10;
		//b1.count = 11;
		System.out.println("count = " + b3.getCount());
		*/
		//
		Person p = new Person();
		//p.name.toString();
		//System.out.println("name = " + p.name.toString());
		System.out.println(p);
		//
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("Hello. What is your name?"); String name = br.readLine();
		 * System.out.println("How old are you?"); int age =
		 * Integer.parseInt(br.readLine());
		 * 
		 * System.out.println("Hello " + name); System.out.println("You are " + age);
		 */
	}
}
