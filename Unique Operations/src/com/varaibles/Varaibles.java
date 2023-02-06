package com.varaibles;

class InstanceVaraible{
	int a=5;
	
	void show() {
		int a=10;
		System.out.println(a);
	}
}
public class Varaibles {
public static void main(String[] args) {
	InstanceVaraible iv=new InstanceVaraible();
	//iv.a=20;
	iv.show();
	System.out.println(iv.a);
	
}
}
