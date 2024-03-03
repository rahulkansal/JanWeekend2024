package com.java.practice;

public class ClassAndObject {
	
	private String name;
	static String profession;
	
	ClassAndObject(){
		System.out.println("non parameter constructor");
	}
	ClassAndObject(String nameValue){
		System.out.println("parameter constructor");
		name = nameValue;
	}
	
	
	private void display() {
		System.out.println("display method");
	}
	
	public static void display1() {
		System.out.println("static display method");
	}
	
	public void addition(int a, int b) {
		int c =a+b;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAndObject classAndObject = new ClassAndObject();
		classAndObject.profession ="IT";
		classAndObject.name ="Rahul";
		System.out.println(classAndObject.name);
		classAndObject.addition(30, 20);
		classAndObject.display();
		
		
		ClassAndObject classAndObject1 = new ClassAndObject();
		//classAndObject.profession ="IT";
		classAndObject1.name ="Automation";
		
		System.out.println(classAndObject1.name);
		classAndObject1.addition(30, 30);
		/* //classAndObject1.display();
		System.out.println(classAndObject1.profession);
		System.out.println(ClassAndObject.profession = "yuyuy");
		ClassAndObject.display1(); */
		
		String value = 20<10 ? "success" : "Failed" ;
		
		System.out.println(value);
		
		ClassAndObject classAndObject2 = new ClassAndObject("Pran");
		System.out.println(classAndObject2.name);
		classAndObject2.addition(50, 50);


	}

}
