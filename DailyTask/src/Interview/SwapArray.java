package Interview;

import java.util.Scanner;

public class SwapArray {
	public static void main(String[] info) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Array Size...");
		int size = sc.nextInt();
		System.out.println("Enter " + size + " numbers...");
		int[] numbers = new int[size];
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		System.out.println("The array stored are...");
		for (int i = 0; i < size; i++) {
			int array = numbers[i];
			System.out.println(array);
		}
		System.out.println("Enter the swap Number...");
		int swap = sc.nextInt();
		int reverse[] = new int[size];
		int pos = 1;
		while (swap > 0) {
			reverse[swap - 1] = numbers[numbers.length - pos];
			swap--;
			pos++;
			System.out.println(swap);
		}
		System.out.println("Enter the remaining value");
		int afterswaped = 0;
		for (int i = 2; i < size; i++) {
			reverse[i] = sc.nextInt();
			afterswaped = reverse[i];
			System.out.println(afterswaped + " " + i);
		}
		System.out.println("The Final array stored is");

		for (int i = 0; i < size; i++) {
			int finalvalue = reverse[i];
			System.out.println(finalvalue + " The positon it is stored in " + i);
		}

	}
}