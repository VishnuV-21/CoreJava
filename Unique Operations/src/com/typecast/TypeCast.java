package com.typecast;

public class TypeCast {
public static void main(String[] args) {
	//implicit typecasting
	byte a =10;
	double b=a;
	System.out.println(b);
	
	//explicit typecasting
	double c=20;
	byte d=(byte)(c);//even if you are double type, come to me as byte 
	System.out.println(d);
}
}
