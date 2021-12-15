package org.com;

public class Employee {
	
	public static void main(String[] args) {
		
		int a []= new int [9];
		
		        a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
				a[4]=50;
				a[5]=60;
				a[6]=70;
				a[7]=80;
				a[8]=90;
				
				System.out.println(a[7]);
				
				
				
				int length = a.length;
				System.out.println(length);
		
				
				
         for (int i = 0; i < 9; i++) {
					
					System.out.println(a[i]);
				}
					
					for (int x  : a) {
						System.out.println(x);
					
				
					}
				}
	}


