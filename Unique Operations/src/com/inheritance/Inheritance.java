package com.inheritance;
class A{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void setValues(int id, String name) {
		this.id=id;
		this.name=name;
	}
}


class B extends A{
	
	
}
public class Inheritance {
	
	public static void main(String[] args) {
		B obj=new B ();
		obj.setValues(0, null);
			
		
	}
}
