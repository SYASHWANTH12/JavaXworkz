package com.xworkz.news.util;

import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		int[] number = new int[5];
		Scanner Sc = new Scanner(System.in);
		int temp;
		for (int i = 0; i < number.length; i++) {
			number[i] = Sc.nextInt();
		}
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {

				if (number[i] > number[j]) {

					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

	}

}
