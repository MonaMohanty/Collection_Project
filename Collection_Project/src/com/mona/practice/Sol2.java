package com.mona.practice;

public class Sol2 {
int x;
public int m1(int x)
{
	this.x=this.x+x*x;
	return x;
}
public static void main(String[] args) {
	int x = 10;
	Sol2 s=new Sol2();
	System.out.println(s.m1(x));
	System.out.println(s.m1(x));
	System.out.println(s.x+x);
}
}
