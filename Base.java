package com.acad.basic;

public class Base {
String name;
	
	public Base() {
		this("");
		System.out.println("base class ");
	}
	
	
	Base(String name){
	this.name=name;
		System.out.println("calling parameterrize constructor"+"of base class ");
		
	}
}
class Derived extends  Base{
	
	
public Derived() {
	 System.out.println("No-argument constructor " + 
             "of derived");
}
public Derived(String name){
	super(name);
	System.out.println("Calling parameterized " + 
            "constructor of derived");
	

}
}