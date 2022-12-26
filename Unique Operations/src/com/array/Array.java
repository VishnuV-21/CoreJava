package com.array;


import java.util.Scanner;

interface TypesOfArrays {
	void oneDArray();

	void twoDArray();

	void jaggedArray();
	void arrayWithObjects();
	

}

public class Array implements TypesOfArrays {
	
	 String name ;
	 int objCount;
	 
	 
	

	public Array(String name, int objCount) {
		super();
		this.name = name;
		this.objCount = objCount;
	}

	public Array() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrayWithObjects() {
	Array []arrayObj=new Array[3];
	arrayObj[0]=new Array("Usha",1);
	arrayObj[1]=new Array("Vishnu",3);
	arrayObj[2]=new Array("Jyothi",5);
	
	
	
	for(int i=0;i<arrayObj.length;i++) {
		System.out.println(arrayObj[i].name+ "   "+arrayObj[i].objCount);
	}
		
	}

	static Scanner sc = new Scanner(System.in);
	static int marks[] = new int[5];
	// 4 different classes and each storing marks of 3 students.
	static int classAndSubjects[][] = new int[4][3];
	
	
	@Override
	public void oneDArray() {
		// TODO Auto-generated method stub
		// storing marks of 5 students
		System.out.println("Enter the marks of 5 students");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		for (int marksOfStuds : marks) {
			System.out.println(marksOfStuds);
		}

	}

	@Override
	public void twoDArray() {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks of the subjects");
		for (int i = 0; i < classAndSubjects.length; i++) {
			for (int j = 0; j < classAndSubjects[i].length; j++) {
				classAndSubjects[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < classAndSubjects.length; i++) {

			System.out.println("The Marks of students in class " + (i + 1) + "A");
			for (int j = 0; j < classAndSubjects[i].length; j++) {
				System.out.println(classAndSubjects[i][j]);

			}

		}
	}

	@Override
	public void jaggedArray() {
		int jaggedArrays[][]= new int [3][];
		jaggedArrays[0]=new int [2];
		jaggedArrays[1]=new int [3];
		jaggedArrays[2]=new int [4];
		
for(int i=0;i<jaggedArrays.length;i++) {
	System.out.println("Enter the marks of student in class "+(i+1)+" A");
	for(int j=0;j<jaggedArrays[i].length;j++) {
		jaggedArrays[i][j]=sc.nextInt();
	}
}
for(int i=0;i<jaggedArrays.length;i++) {
	System.out.println("The marks of student in class "+(i+1)+" A");
	for(int j=0;j<jaggedArrays[i].length;j++) {
		System.out.println(jaggedArrays[i][j]);
	}
}


	}

	public static void main(String[] args) {

		TypesOfArrays array = new Array();
		// array.oneDArray();
		//array.twoDArray();
		//array.jaggedArray();
		array.arrayWithObjects();
	}

}
