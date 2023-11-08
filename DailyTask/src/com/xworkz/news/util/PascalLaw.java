package com.xworkz.news.util;

import java.util.Scanner;

public class PascalLaw {
	public static void main(String[] args) {
		int n = 6;
		for (int i = 1; i < n; i++) {
			for (int k = i; k < n; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}

/*
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Enter the number of rows: "); int n = scanner.nextInt();
 * System.out.println(); for (int i = 0; i < n; i++) { for (int j = 0; j < n -
 * i; j++) { System.out.print(" "); } for (int j = 0; j <= i; j++) {
 * System.out.print(binom(i, j) + " "); } System.out.println(); } } static int
 * binom(int n, int r) { if (r > n / 2) { r = n - r; } int result = 1; for (int
 * i = 1; i <= r; i++) { result *= (n - r + i); result /= i; } return result; }
 */