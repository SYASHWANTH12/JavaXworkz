package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
	static int removeDuplicates(String[] a) {
		int rd = 0;
		for (int i = 1; i < a.length; i++) {
			if (!(a[rd].equals(a[i]))) {
				rd++;
				a[rd] = a[i];
			}
		}
		return rd;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] st = new String[n];
		for (int i = 0; i < st.length; i++) {
			st[i] = s.next();
		}

		Arrays.sort(st);

		int x = removeDuplicates(st);
		for (int i = 0; i <= x; i++) {
			System.out.print(st[i] + " ");
		}

	}

}
