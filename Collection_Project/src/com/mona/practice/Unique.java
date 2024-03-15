package com.mona.practice;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Unique {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of list1: ");
	String list1=s.nextLine();
	String[] pl1=list1.split(" ");
	System.out.println("Enter the value of list2: ");
	String list2=s.nextLine();
	String[] pl2=list2.split(" ");
	
    ArrayList al=new ArrayList();
    
	for (String string : pl1) {
		al.add(string);
	}
	
	TreeSet hs=new TreeSet();
	for (Object o : pl1) {
		hs.add(o);
	}
	for (Object o: pl2) {
		hs.add(o);
	}
	
	System.out.println(hs);
}
}
