package com.java.practice;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(10/0);
		try {
		int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown  :" + e);
     }
		finally {
			System.out.println("finally");
		}

		
		System.out.println("After Exception");
	}

}
