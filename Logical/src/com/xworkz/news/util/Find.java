package com.xworkz.news.util;

public class Find {

	public static void main(String[] args) {
		int[] in = new int[10];
		// Scanner S = new Scanner(System.in);
		int m = 10;
		int n = 20;

		for (int i = 1; i < in.length; i++) {
			in[i] = m * i;
			int y1 = in[i];
			for (int j = 1; j < in.length; j++) {
				in[j] = n * j;
				int y2 = in[j];
				// System.out.println(y1 + " " + y2);
				if (y1 == y2) {
					System.out.println(y1);
				}

			}

		}

	}
}
