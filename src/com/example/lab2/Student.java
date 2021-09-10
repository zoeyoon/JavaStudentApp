package com.example.lab2;

public class Student implements Comparable<Student> {
	int no; 
	String name;
	int age;
	
	public Student(int n1, String str, int n2) {
		this.no = n1;
		this.name = str;
		this.age = n2;
	}
	
	public String toString(){
		return "Student [no="+no+", name="+name+", age="+age+"]";
	}

	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}

