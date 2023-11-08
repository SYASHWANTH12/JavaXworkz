package com.xworkz.news.util;

public class Febonocii {
	public static void main(String[] args) {
		int n = 0;int m = 1;int y;
		for (int i = 2; i < 10; i++) {
			y = n + m;
			System.out.println(y);
			n = m;
			m = y;
		}
	}
}
