package com.string;



interface MethodsInSpring1{
	void substring();
	void insertString();
	void deleteString();
	void upperToLower();
}
public class StringOps implements MethodsInSpring1{
public static void main(String[] args) {
	MethodsInSpring1 mis=new StringOps();
	mis.substring();
	mis.insertString();
	mis.deleteString();
	mis.upperToLower();
	
}

@Override
public void upperToLower() {
	// TODO Auto-generated method stub
	char uppChar='A';
	int value=uppChar+32;
	char lowChar=(char)(uppChar+32);
	System.out.println(value);
	System.out.println(lowChar);
}

@Override
public void deleteString() {
	// TODO Auto-generated method stub
	//This method is related to string buffer and string builder
	StringBuilder sb=new StringBuilder();
	sb.append("Sajin S Babu"); //same concept as substring
	sb.delete(6, 8);
	System.out.println(sb);
}

@Override
public void insertString() {
	// TODO Auto-generated method stub
	//This method is related to string buffer and string builder
	StringBuilder sb=new StringBuilder();
	sb.append("Vishnu");
	sb.insert(6, " Prakash");
	System.out.println(sb);
}

@Override
public void substring() {
	// TODO Auto-generated method stub
	//This is how the substring method of String class works
			String name="VishnuPrakash"; // char-index at 0 which is 'V' and i don't want from 6 which is 'P' as i don't want 6 it does'nt print it.
			String n2=name.substring(0,6);//The formula is char-index to end+1: here it is V to Space
			String n3=name.substring(6, 13);
			System.out.println(n2);
			System.out.println(n3);
			String name1="VishnuJyothiPraksh";
			String n4=name1.substring(6,12);
			System.out.println(n4);
			System.out.println(name.length());
}
}
