package com.xworkz.news.util;

import java.util.Scanner;

public class Descending {
	public static void main(String[] args) {
		int[] in = new int[5];
		Scanner S = new Scanner(System.in);
		int temp;
		System.out.println("Enter Five numbers ");
		for (int i = 0; i < in.length; i++) {

			in[i] = S.nextInt();
		}
		for (int i = 0; i < in.length; i++) {
			for (int j = i + 1; j < in.length; j++) {
				if (in[i] < in[j]) {
					temp = in[i];
					in[i] = in[j];
					in[j] = temp;
				}
			}
		}
		for (int i = 0; i < in.length; i++) {
			System.out.println(in[i]);
		}
	}

}
