package org.com;

public class Employee2 {
	
	
	public static void main(String[] args) {
		
		int x [] [] = new int [2][5];
			
		x[0][0]=100;
		x[0][1]=200;
		x[0][2]=300;
		x[0][3]=400;
		x[0][4]=500;
		x[1][0]=600;
		x[1][1]=700;
		x[1][2]=800;
		x[1][3]=900;
		x[1][4]=1000;
 		
		System.out.println ( x[1] [1] );
		
		
	
		
		for (int i = 0; i < 2; i++) {
			
			
			for (int j = 0; j < 5; j++) {
				
				System.out.println(x[i][j]);
				
			}
			
			System.out.println("---------- ");
			
			for (int[] a : x ) {
				for (int j : a) {
					System.out.println(j);
					
				}
				
				
				
			}
			
		}
		
		
		
	}

}
