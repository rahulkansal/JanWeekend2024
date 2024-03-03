package com.java.practice;

public class SuperClass {
	
	String name;
	SuperClass(){
		System.out.println("super class const");
	}
	
	
	public void addition(int a , int b) {
		System.out.println(a+b);
	}
	
	public float addition(float a , int b) {
		System.out.println(a+b);
		return a+b;
	}

	
	public void addition(int a , int b, int c) {
		System.out.println(a+b+c);
	}

	
	public void subtraction(int a , int b) {
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
