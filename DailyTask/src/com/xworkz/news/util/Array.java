package com.xworkz.news.util;

import java.util.Scanner;

public class Array {
	public static void main(String[] info) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Size of an array ");
		int size = S.nextInt();
		int[] in = new int[size];
		System.out.println("Enter " + size + "integer");
		for (int i = 0; i < in.length; i++) {

			in[i] = S.nextInt();
		}
		System.out.println("Enter the value you should find");
		int Y = S.nextInt();
		for (int i = 0; i < in.length; i++) {
			if (in[i] == Y) {
				System.out.println("The integer is found in=" + i);
			}
		}
	}
}