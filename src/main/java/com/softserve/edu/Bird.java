package com.softserve.edu;

public abstract class Bird {
	
	public String feathers;
	public int layEggs;
	
	public abstract void fly();
	
	public abstract void input();

	public static void main(String[] args) {
		
		Bird[] birds = {new Eagle("gray", 10), new Swallow("black", 20), new Penguin("black and white", 5), new Eagle("piebald", 18)};
		
		for(Bird current : birds) {
			current.input();
			current.fly();
		}
	}

}
