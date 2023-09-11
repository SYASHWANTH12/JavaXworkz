package Anusha;

public class Palidrone {
	
	int N = 4;
	int N1 = 5;
	int N2 = 4;
	int[] N3 = { N, N1, N2 };
	int[] N4;
	{

		for (int i = 2; i <= 0; i--) {
			int N4 = N3[i];
			System.out.println(N4);
		}
		
		if(N4==N3)
		{
			System.out.println("It is a palidrone");
		}
		else {
			System.err.println("It is an not polidrone");
		}
	}
	public static void main(String[] info)
	{
		Palidrone palidrone=new Palidrone();
		
	}
}
