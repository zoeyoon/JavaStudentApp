package com.example.lab2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		al.add(new Student(101, "Kim", 23));
		al.add(new Student(102, "Yoon", 21));
		al.add(new Student(103, "Park", 24));
		al.add(new Student(104, "Cheon", 21));
		al.add(new Student(105, "Lee", 22));
		al.add(new Student(106, "Seo", 28));
		al.add(new Student(107, "Na", 23));
		al.add(new Student(108, "Bae", 25));
		al.add(new Student(109, "Hwang", 23));
		al.add(new Student(110, "Song", 26));
		
		Collections.sort(al);
		for (Student s : al){
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++){
			System.out.println(al.get(i).toString());
		}
		
	}

}
