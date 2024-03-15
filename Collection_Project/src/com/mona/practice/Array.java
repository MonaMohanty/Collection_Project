package com.mona.practice;

import java.util.ArrayList;
import java.util.Collections;
;


class Student implements Comparable<Student>{
	int id;
	String name;
	public Student(int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString()
	{
		return id+"_"+name;
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.id>o.id)
//		{
//			return 1;
//		}
//		else if(o.id>this.id)
//		{
//			return -1;
//		}
//		return 0;
//	}
	@Override
	public int compareTo(Student o)
	{
		if(this.name.compareTo(o.name)>0)
		{
			return 1;
		}
		else if(this.name.compareTo(o.name)<0)
		{
			return -1;
			
		}
		return 0;
	}
}
public class Array {
public static void main(String[] args) {
	
	Student s1=new Student(5,"M");
	Student s2=new Student(3,"O");
	Student s3=new Student(4,"P");
	Student s4=new Student(2,"S");
	Student s5=new Student(1,"H");
	
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	System.out.println(al);
    Collections.sort(al);
    System.out.println(al);
}
}
