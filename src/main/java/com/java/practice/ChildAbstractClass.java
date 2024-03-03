package com.java.practice;

public class ChildAbstractClass extends SuperAbstractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildAbstractClass childAbstractClass =  new ChildAbstractClass();
		
		childAbstractClass.addition();
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("child abstract addition");
	}

}
