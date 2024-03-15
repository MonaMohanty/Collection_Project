package com.mona.practice;

import java.util.Scanner;

public class Avg {
public static void main(String args[])
{
	Scanner scan= new Scanner(System.in);
	int mark1=scan.nextInt();
	System.out.println("enter the value of mark1:");
	int mark2=scan.nextInt();
	System.out.println("enter the value of mark1:");
	int mark3=scan.nextInt();
	System.out.println("enter the value of mark1:");
     int avg=(mark1+mark2+mark3)/3;
     System.out.println("the avg is" +avg);
}
}
