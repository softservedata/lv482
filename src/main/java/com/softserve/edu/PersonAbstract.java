package com.softserve.edu;

public abstract class PersonAbstract {
		
	   public String name;
	    
		void print(){
			
		}
		
		public static void main(String[] args) {
			
			PersonAbstract[] person = { new Teachers ("Vasa"), new Students ("Roma"), new Cleaners("Kola")};
			
			for(PersonAbstract current : person) {
				current.print();
				Staff.salary();
			}
		}
}
