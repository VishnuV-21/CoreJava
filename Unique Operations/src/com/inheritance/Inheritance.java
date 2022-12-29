package com.inheritance;
class A{
	private int id;
	private String name;
	int rank;
	
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
	B obj=new B ();
	void run() {
		//obj.id=20; ///not visible since it is private 
		obj.rank=20;
	}
	//private methods does not participate in inheritance
}
public class Inheritance {
	
	public static void main(String[] args) {
		B obj=new B ();
		obj.setValues(0, null);
			
		
	}
}
