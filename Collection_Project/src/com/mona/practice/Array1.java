package com.mona.practice;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student1 {
	int id;
	String name;
	public Student1(int id, String name)
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
}
class Sorting implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
	
		return 0;
	}
	
}
		   
public class Array1 {
public static void main(String[] args) {
	
	Student1 s1=new Student1(5,"M");
	Student1 s2=new Student1(3,"O");
	Student1 s3=new Student1(4,"P");
	Student1 s4=new Student1(2,"S");
	Student1 s5=new Student1(1,"H");
	
	ArrayList<Student1> al=new ArrayList<Student1>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	System.out.println(al);
    Collections.sort(al, new Comparator<Student1>()
    {
    		@Override
    		public int compare(Student1 o1, Student1 o2) {
		
		if(o1.id>o2.id)
		{
		return 1;
	}
	else if(o1.id<o2.id)
{
		return -1;
		
	}
	return 0;
}
    });
    System.out.println(al);
}
}

	


