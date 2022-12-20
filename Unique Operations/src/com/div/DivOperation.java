package com.div;

public class DivOperation {
public static void main(String[] args) {
	 int a=10;
	 int b=3;
//The output will be int/int = int ,even though datatype is float and ans should be 3.33...
	 float f= a/b;
	 double d= a/b;
	 
//1. if we make any of the varaibles as float , int/float or float/int ans = float 
//2. int or float / double or vice versa is always double.
	 int v=20;
	 float h=11;
	 double r=7;
	 
	 float r1=v/h;  //int/float = float 
	 double r2= r/v;  //double/int = double 
	 double r3=r/h;  //double/float = double 
	 
	 System.out.println(f);
	 System.out.println(d);
	 
	 System.out.println(r1);
	 System.out.println(r2);
	 System.out.println(r3);
	 
}
}
