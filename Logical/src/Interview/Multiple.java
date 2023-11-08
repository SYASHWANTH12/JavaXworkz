package Interview;

public class Multiple {
	int m;
	int n;

	public int factorial(int m, int n) {
		this.m = m;
		this.n = n;
		System.out.println(""+m+n+"");
		for (int i = 1; i <= 10; i++) {
			int M = m * i;
			int N = n * i;
			
		}
		return 0;

	}

	public static void main(String[] args) {
		Multiple b = new Multiple();
		System.out.println(b.factorial(3, 4));
	}
}
