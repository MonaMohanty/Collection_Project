package com.mona.practice;



public class Rectangle {
//	public static void main(String args[]) {
//		System.out.println("user! please enter 2 value");
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		System.out.println("the result is" + RectangleArea(n,m));
//		scan.close();
//	}
//
//	public static int RectangleArea(int l,int b) {
//		return (l * b);
//	}
	
	    public static void main(String[] args) {
	        int n = 3;
	        generatePattern(n);
	    }

	    private static void generatePattern(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if ((i == 1 || i == n) && (j == 1 || j == n)) {
	                    System.out.print("**");
	                } else {
	                    System.out.print(".");
	                }
	                }
	            System.out.println();
	        }
	    }
}
