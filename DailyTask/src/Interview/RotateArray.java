package Interview;

import java.util.Arrays;

public class RotateArray {
	int sum;

	public static void save(int sum) {
		if (sum < 100) {
			System.out.println(sum);
			sum = sum + 1;
			save(sum);
		}
	}

	public static void main(String[] args) {
		RotateArray.save(1);
	}
}
