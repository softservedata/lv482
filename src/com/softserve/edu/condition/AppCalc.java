package com.softserve.edu.condition;

import com.softserve.edu.Temp;

public class AppCalc {

	public static void main(String[] args) {
		Temp t = new Temp();
		Calc calc = new Calc();
		System.out.println("2+2= " + calc.add(2, 2) );
		System.out.println("20/2= " + calc.div(20, 2) );
	}

}
