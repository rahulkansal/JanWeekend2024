package com.java.practice;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int x = 1; x < 10; x ++) {
	         System.out.println("value of x : " + x );
	      }
		
		
	/*	int x = 5;
	      while( x < 20 ) {
                     System.out.println("value of x : " + x );
  	     x++;
 	   } */

	      
	      int x = 10;
	      do {
	       	  System.out.println("value of x : " + x );
	        	 x++;
		}while( x < 20 );

	      
	      for(int x1 = 1; x1 < 10; x1 ++) {
	            if(x1 == 5){
	            	continue; }
	            System.out.println("value of x : " + x1 );
	        }


	}

}
