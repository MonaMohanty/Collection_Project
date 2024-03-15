package com.mona.practice;

public class Sol {
	
		public static void main(String[] args) {
			int n = 5;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n || i == n / 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * n; j++) {
					if (j == n - i + 1 || j == n + i - 1 || (i == n / 2 + 1 && j > n / 2 && j < n + i)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (((i == 1 || i == n / 2 + 1) && j < n) || (i > 1 && i < n / 2 + 1 && j == n) || j == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (((i == 1 || i == n / 2 + 1) && j < n) || (i > 1 && i < n / 2 + 1 && j == n) || j == 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (i <= n / 2 + 1 && (i == j || j == n - i + 1) || i > n / 2 + 1 && j == n / 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();

			}
			System.out.println();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= 2 * n; j++) {
					if (j == n - i + 1 || j == n + i - 1 || (i == n / 2 + 1 && j > n / 2 && j < n + i)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n || i == j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (j == 1 || j == n || i == j) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (i == 1 || i == n || j == n / 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * n; j++) {
					if (i == j || j == 2 * n - i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (i == 1 || j == 1 || i == n || i == n / 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if ((i == 1 || i == n / 2 + 1) && j < n || (i > 1 && i < n / 2 + 1 && j == n) || j == 1
							|| (i > n / 2 + 1 && j == 2 * i - n)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (((i == 1 || i == n / 2 + 1 || i == n) && j < n) && j > 1 || i < n / 2 + 1 && i > 1 && j == 1
							|| i > n / 2 + 1 && i < n && j == n) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * n; j++) {
					if (j == n - i + 1 || j == n + i - 1 || (i == n / 2 + 1 && j > n / 2 && j < n + i)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if ((i == 1 || i == n / 2 + 1) && j < n || (i > 1 && i < n / 2 + 1 && j == n) || j == 1
							|| (i > n / 2 + 1 && j == 2 * i - n)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				for (int j = i; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n; j++) {
					if (i <= n / 2 + 1 && (i == j || j == n - i + 1) || i > n / 2 + 1 && j == n / 2 + 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}

		}

	}

