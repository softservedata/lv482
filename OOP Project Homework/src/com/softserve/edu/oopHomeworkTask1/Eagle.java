package com.softserve.edu.oopHomeworkTask1;

public class Eagle extends FlyingBird {
	
	public Eagle(String nameOfBird, boolean layEggs, boolean feathers) {
		super(nameOfBird, layEggs, feathers);
	}
	@Override
	public String toString() {
		String isFeathers="";
		String isLayEggs="";
		if(this.isFeathers()) {
			isFeathers=" [This bird HAVE FEATHERS]";
		}else {
			isFeathers=" [This bird HAVE NOT FEATHERS]";
		}
		if(this.isLayEggs()) {
			isLayEggs=" [This bird LAYS EGGS]";
		}else {
			isLayEggs=" [This bird DOESN'T LAY EGGS]";
		}
		return "name= ["+this.getNameOfBird()+"] "+isFeathers+isLayEggs+this.fly() ;
		
	}


}
