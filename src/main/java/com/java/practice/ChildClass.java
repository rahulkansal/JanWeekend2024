package com.java.practice;

public class ChildClass extends SuperClass{
	
	ChildClass(){
		super();
		System.out.println("child class construct");
	}
	
	public void multiple(int a , int b) {
		System.out.println(a*b);
	}
	
	public void subtraction(int a , int b) {
		System.out.println(a-b-2);
	}
	
	public void display() {
		super.addition(40, 50);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass superClass = new SuperClass();
		superClass.addition(20, 40);
		
		ChildClass childClass = new ChildClass();
		childClass.subtraction(30, 20);
		childClass.name ="Rahul";
		System.out.println(childClass.name);
		childClass.multiple(20, 10);
		
		childClass.addition(20, 10, 40);
		
		childClass.subtraction(39, 10);
		superClass.subtraction(30, 10);
		
		childClass.display();
		
	}

}
