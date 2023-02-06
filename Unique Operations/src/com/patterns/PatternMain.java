package com.patterns;

import java.util.Scanner;

interface AllMethods{
	public abstract void alphaHor();
	void alphaVer();
	void starHalfPyramidPattern();
	void starFullPyramidPattern();
	
}

class Alpha implements AllMethods{
 
static Scanner sc= new Scanner(System.in);
static int n;

	@Override
	public void alphaHor() {
		
		System.out.println(" This code gives the letters in Horizotnal way..");
	System.out.println("Enter the value of n: ");	
	n=sc.nextInt();
	System.out.println("\n");
		// TODO Auto-generated method stub
		for(int i =0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(i==0&&j!=0&&j!=n-1 || i==(n-1)/2 || j==0&&i!=0 || j==n-1&&i!=0 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}	
			}
//space between each letter 
			System.out.print("   ");
			
			for (int j=0;j<n;j++) {
				if( i==0&&j!=n-1 || i==n-1&&j!=n-1 || i==(n-1)/2&&j!=(n-1) || j==(n-1)&&i!=0&&i!=n-1 || j==0 ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}	
			}
			
			System.out.println("");
		}
	}

	@Override
	public void alphaVer() {
		System.out.println(" This code gives the letters in Vertical way..");
		System.out.println("Enter the value of n: ");	
		n=sc.nextInt();
		System.out.println("\n");	
		//This is for C
		for(int i =0;i<n;i++) {
			for(int j =0;j<n;j++) {
				if( j==0&&i!=0&&i!=n-1 || i==0&&j!=0 || i==n-1&&j!=0 ) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		//This is for D
				for(int i =0;i<n;i++) {
					for(int j =0;j<n;j++) {
						if( j==0 || i==0&&j!=n-1 || i==n-1&&j!=n-1 || j==n-1&&i!=0&&i!=n-1 ) {
							System.out.print("* ");
						}
						else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
	}

	@Override
	public void starHalfPyramidPattern() {
		// TODO Auto-generated method stub
		//creating a pyramid pattern 
		System.out.println(" This code gives the Pyramid pattern ..");
		System.out.println("Enter the value of n: ");	
		n=sc.nextInt();
		System.out.println("\n");	
		for(int i =0;i<n;i++){
			{
				for(int j=0;j<n;j++) {
					if(i+j>=(n-1)/2&&i<=(n-1)/2&&j<=(n-1)/2 || j-i<=(n-1)/2 && i<=(n-1)/2 &&j>=(n-1)/2)
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
		}
			
		}
	}
	
	@Override
	public void starFullPyramidPattern() {
		// TODO Auto-generated method stub
		System.out.println(" This code gives the Pyramid pattern ..");
		System.out.println("Enter the value of n: ");	
		n=sc.nextInt();
		System.out.println("\n");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=(n-1) ) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.print("");
			
				for(int j=0;j<n;j++) {
					if(i>=j) 
						System.out.print("* ");
					else
						System.out.print("  ");
				}
				System.out.println();
	
}
}
	}



public class PatternMain {

	public static void main(String[] args) {
		//achieved runtime poly/latebinding 
		AllMethods method1= new Alpha();
		method1.alphaHor();
		//method1.alphaVer();
		//method1.starHalfPyramidPattern();
		//method1.starFullPyramidPattern();
	

	}

}
