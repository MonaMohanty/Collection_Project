package com.mona.practice;

public class Solution {
public static void main(String[] args) {
	int a=20;
	int b=10;
	int c=30;
	int res=(a>b && a>c)?a:(b<c && b>a)?b:c;
	System.out.println(res);
}
}
