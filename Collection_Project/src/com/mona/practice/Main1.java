package com.mona.practice;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class Main1 {
public static void main(String[] args) {
	Stack s=new Stack();
	s.add(10);
	s.add(20);
	System.out.println(s);
	
	Vector v=new Vector();
	v.add(30);
	v.add(40);
	System.out.println(v);
	
	Hashtable h=new Hashtable();
	h.put(1, 30);
	h.put(3, 40);
	System.out.println(h);
	
	Properties p=new Properties();
	p.put(3, 10);
	p.put(2, 50);
	System.out.println(p);
}
}
